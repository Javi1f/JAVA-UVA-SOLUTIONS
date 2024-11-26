import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrimaryAritmethic {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while (!(line = bf.readLine()).equals("0 0")) {

			String[] esp = line.split(" ");

			int carry = calculate(esp[0], esp[1]);

			if (carry == 0) {
				System.out.println("No carry operation.");
			} else {
				if (carry > 1) {
					System.out.println(carry + " carry operations.");
				} else {
					System.out.println(carry + " carry operation.");
				}
			}

		}

	}

	public static int calculate(String num1, String num2) {

		ArrayList<Integer> numbers1 = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		ArrayList<String> result = new ArrayList<>();
		for (int i = 1; i <= num1.length(); i++) {
			numbers1.add(Integer.parseInt(num1.charAt(num1.length() - i) + ""));
		}
		for (int i = 1; i <= num2.length(); i++) {
			numbers2.add(Integer.parseInt(num2.charAt(num2.length() - i) + ""));
		}
		int num = 0;
		if (numbers1.size() > numbers2.size()) {
			num = numbers1.size();
		} else {
			num = numbers2.size();
		}
		for (int i = 0; i < num; i++) {
			if (i > numbers1.size() - 1) {
				result.add(numbers2.get(i) + "");
			} else if (i > numbers2.size() - 1) {
				result.add(numbers1.get(i) + "");
			} else {
				result.add(Integer.toString(binarySum(numbers1.get(i), numbers2.get(i))));

			}
		}
		return manageCarry(result);
	}

	public static int binarySum(int x, int y) {
		int carry = (x & y) << 1;
		int res = x ^ y;
		if (carry == 0) {
			return res;
		}
		return binarySum(carry, res);
	}

	public static int manageCarry(ArrayList<String> result) {
		int count = 0;
		for (int i = 0; i < result.size(); i++) {
			if (result.indexOf(result.get(i)) == result.size() - 1 && result.get(i).length() == 2) {
				count++;
				result.add(result.get(i).charAt(0) + "");
			} else if (result.get(i).length() == 2) {
				count++;
				result.set(i + 1, "" + binarySum(Integer.parseInt(result.get(i + 1)),
						Integer.parseInt(result.get(i).charAt(0) + "")));
				result.set(i, result.get(i).charAt(1) + "");
			}
		}

		return count;
	}

}

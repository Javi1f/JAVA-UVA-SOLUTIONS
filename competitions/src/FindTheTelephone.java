import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class FindTheTelephone {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> mapto = new HashMap<>();

		mapto.put('A', 2);
		mapto.put('B', 2);
		mapto.put('C', 2);

		mapto.put('D', 3);
		mapto.put('E', 3);
		mapto.put('F', 3);

		mapto.put('G', 4);
		mapto.put('H', 4);
		mapto.put('I', 4);

		mapto.put('J', 5);
		mapto.put('K', 5);
		mapto.put('L', 5);

		mapto.put('M', 6);
		mapto.put('N', 6);
		mapto.put('O', 6);

		mapto.put('P', 7);
		mapto.put('Q', 7);
		mapto.put('R', 7);
		mapto.put('S', 7);

		mapto.put('T', 8);
		mapto.put('U', 8);
		mapto.put('V', 8);

		mapto.put('W', 9);
		mapto.put('X', 9);
		mapto.put('Y', 9);
		mapto.put('Z', 9);

		mapto.put('1', 1);
		mapto.put('0', 0);

		String line;
		while ((line = bf.readLine()) != null) {

			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '-') {
					sb.append("-");
				} else {
					sb.append(mapto.get(line.charAt(i)));
				}

			}
			System.out.println(sb.toString());

		}

	}

}

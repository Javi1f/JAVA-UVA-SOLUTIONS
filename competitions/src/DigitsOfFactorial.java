import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class DigitsOfFactorial {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String n = bf.readLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {

			String[] line = bf.readLine().split(" ");
			System.out.println(line[0] + " " + line[1]);
//			BigInteger factorial = new BigInteger("1");
//			for (int j = 1; j <= Integer.parseInt(line[0]); j++) {
//				factorial = factorial.multiply(new BigInteger(j + ""));
//			}
			BigInteger factorial = calculateFactorial(Integer.parseInt(line[0]));
			String parse = "";
			if (line[1].equals("10")) {
				parse = factorial.toString();
			} else {
				parse = factorial.toString(Integer.parseInt(line[1]));
			}
			System.out.println(factorial);
			System.out.println("Case " + (i + 1) + ":" + parse.length());

		}
	}

	static BigInteger calculateFactorial(int n) {

		if (n == 0) {

			return new BigInteger("1");
		}
		return BigInteger.valueOf(n).multiply(calculateFactorial(n - 1));
	}
}

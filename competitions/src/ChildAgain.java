import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class ChildAgain {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String n = "";

		while ((n = bf.readLine()) != null) {

			String[] split = n.split(" ");

			BigInteger a = new BigInteger(split[0]);
			BigInteger b = new BigInteger(split[2]);
			if (split[1].equals("/")) {
				System.out.println(a.divide(b));
			} else if (split[1].equals("%")) {
				System.out.println(a.mod(b));
			}

		}
	}

}

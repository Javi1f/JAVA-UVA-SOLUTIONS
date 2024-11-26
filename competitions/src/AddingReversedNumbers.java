import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class AddingReversedNumbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {

			String[] line = bf.readLine().split(" ");

			line[0] = new StringBuilder(line[0].replaceAll("^0+", "")).reverse().toString().replaceAll("^0+", "");
			line[1] = new StringBuilder(line[1].replaceAll("^0+", "")).reverse().toString().replaceAll("^0+", "");

			BigInteger re = new BigInteger(line[0]).add(new BigInteger(line[1]));

			System.out.println(new StringBuilder(re.toString()).reverse().toString().replaceAll("^0+", ""));

		}

	}

}

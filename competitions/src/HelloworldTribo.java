import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloworldTribo {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		int cs = 1;
		while (Integer.parseInt((line = bf.readLine())) > 0) {

			int n = Integer.parseInt(line);

			int calc = (int) Math.ceil(((logBase2(n) + 1) - Math.ulp(1.0))) - 1;

			System.out.println("Case " + cs + ": " + calc);

			cs++;
		}

	}

	public static double logBase2(double x) {
		return Math.log(x) / Math.log(2);
	}

}

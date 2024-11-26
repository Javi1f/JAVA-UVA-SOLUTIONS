import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Egypt {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while (!(line = bf.readLine()).equals("0 0 0")) {

			String[] num = line.split(" ");

			if (esTrianguloRectangulo(Integer.parseInt(num[0]), Integer.parseInt(num[1]), Integer.parseInt(num[2]))) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}

		}

	}

	public static boolean esTrianguloRectangulo(int a, int b, int c) {
		int[] lados = { a, b, c };
		Arrays.sort(lados);

		return lados[2] * lados[2] == lados[0] * lados[0] + lados[1] * lados[1];
	}

}

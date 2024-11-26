import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int N = Integer.parseInt(bf.readLine());

			if (N == 0) {
				break;
			}

			System.out.println(sumGcdPairs(N));
		}

	}

	// funcion totiente de euler
	public static int phi(int k) {
		int result = k;
		for (int p = 2; p * p <= k; p++) {
			if (k % p == 0) {
				while (k % p == 0) {
					k /= p;
				}
				result -= result / p;
			}
		}
		if (k > 1) {
			result -= result / k;
		}
		return result;
	}

	// funcion para calcular la suma de los pares GCD(i,j)

	public static int sumGcdPairs(int n) {
		int sum = 0;
		for (int k = 1; k <= n; k++) {
			int phiK = phi(k);
			int floor = n / k;
			sum += phiK * floor * floor;
		}
		sum = sum / 2 - (n * (n + 1) / 4);
		return sum;
	}

}

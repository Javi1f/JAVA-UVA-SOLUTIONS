import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cuckoo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cases = sc.nextInt();

		for (int i = 0; i < cases; i++) {

			int N = sc.nextInt();
			int T = sc.nextInt();

			int res = countVerified(N, T);
			System.out.println(res);
		}
		sc.close();
	}

	public static int countVerified(int rows, int cols) {

		if (cols != 1) {

			int nCols = cols - 1;
			List<Integer> divisors = findDivisors(nCols, rows);
			return divisors.size();

		} else {
			return rows;
		}
	}

	public static List<Integer> findDivisors(int n, int maxDivisor) {
		List<Integer> divisors = new ArrayList<>();
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i <= maxDivisor) {
					divisors.add(i);
				}
				if (i != n / i && n / i <= maxDivisor) {

					divisors.add(n / i);
				}
			}
		}
		return divisors;
	}

}
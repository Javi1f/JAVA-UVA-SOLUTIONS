import java.util.HashMap;
import java.util.Scanner;

public class GoldbachsConjectureII {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Integer> sisas = goldbach();

		int cases = sc.nextInt();

		while (cases != 0) {

			System.out.println(sisas.get(cases));

			cases = sc.nextInt();
		}
		sc.close();

	}

	public static boolean criba(int n) {
		if (n <= 1) {
			return false;
		}
		if (n <= 3) {
			return true;
		}
		if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		return true;
	}

	public static HashMap<Integer, Integer> goldbach() {
		HashMap<Integer, Integer> pene = new HashMap<>();
		pene.put(4, 1);
		for (int i = 6; i < Math.pow(2, 15) - 1; i += 2) {
			int count = 0;
			for (int j = 3; j <= i / 2; j += 2) {
				if (criba(j) && criba(i - j)) {
					count++;

				}
			}
			pene.put(i, count);
		}

		return pene;
	}
}

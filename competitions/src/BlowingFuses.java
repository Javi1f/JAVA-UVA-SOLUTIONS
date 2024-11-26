import java.util.Scanner;

public class BlowingFuses {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long count = 1;
		while (true) {

			int n = sc.nextInt();
			long m = sc.nextLong();
			long c = sc.nextLong();

			if (n == 0 && m == 0 && c == 0) {
				break;
			}
			long[] cons = new long[n];
			boolean[] turn = new boolean[n];
			for (int i = 0; i < n; i++) {
				cons[i] = sc.nextLong();
				turn[i] = false;
			}
			long consumo = 0;
			long max = 0;
			boolean blown = false;
			for (int i = 0; i < m; i++) {

				int a = sc.nextInt();
				a--;
				if (!blown) {
					if (turn[a]) {
						consumo -= cons[a];
						turn[a] = false;
					} else {
						consumo += cons[a];
						turn[a] = true;
						if (consumo > c) {
							blown = true;
						}
						if (consumo > max) {
							max = consumo;
						}
					}
				}

			}
			System.out.println("Sequence " + count);
			if (blown) {
				System.out.println("Fuse was blown.");
			} else {
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was " + max + " amperes.");
			}
			System.out.println();
			count++;
		}
		sc.close();
	}

}

import java.util.Scanner;

public class BurgerKingProblem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int N = sc.nextInt();
			int K = sc.nextInt();
			int B = sc.nextInt();
			int[] items = new int[N];
			for (int j = 0; j < items.length; j++) {
				items[j] = sc.nextInt();
			}

			System.out.println(countWays(N, K, B, items));
			sc.close();
		}

	}

	public static int countWays(int N, int K, int B, int[] prices) {

		int count = 0;

		for (int i = 0; i < (1 << N); i++) {
			int sum = 0;
			int pene = 0;

			for (int j = 0; j < N; j++) {
				if ((i & (1 << j)) != 0) {
					sum += prices[j];
					pene++;
				}
			}

			if (pene == K && sum == B) {
				count++;
			}
		}

		return count;
	}
}

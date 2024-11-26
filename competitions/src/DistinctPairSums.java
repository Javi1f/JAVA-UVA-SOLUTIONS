import java.util.Scanner;

public class DistinctPairSums {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int L = sc.nextInt();
			int R = sc.nextInt();

			System.out.println(2 * R - 2 * L + 1);

		}

		sc.close();
	}

}

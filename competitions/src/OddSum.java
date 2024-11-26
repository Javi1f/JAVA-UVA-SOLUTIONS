import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int calc = 0;
			for (int j = a; j <= b; j++) {
				if (j % 2 != 0) {
					calc += j;

				}
			}

			System.out.println("Case " + (i + 1) + ": " + calc);

		}
		sc.close();
	}

}

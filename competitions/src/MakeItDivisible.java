import java.util.Scanner;

public class MakeItDivisible {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int N = sc.nextInt();

			if (N == 1) {
				System.out.println(3);
			} else {
				StringBuilder sb = new StringBuilder();
				sb.append(3);

				for (int j = 1; j <= N - 1; j++) {
					if (j + 1 == N ) {
						sb.append(3);
					} else {
						sb.append(0);
					}
				}
				System.out.println(sb.toString());
			}
		}
		sc.close();
	}

}

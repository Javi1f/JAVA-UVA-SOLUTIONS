import java.util.Scanner;

public class TurnIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int U = sc.nextInt();
			int V = sc.nextInt();
			int A = sc.nextInt();
			int S = sc.nextInt();
			if (U <= V) {
				System.out.println("Yes");
			} else {
				double p = Math.pow(U, 2) - (2 * A * S);
				if (p < 0) {
					p = 0;
				}
				double calc = Math.sqrt(p);
				if (calc <= V || U <= V) {
					System.out.println("Yes");
				} else {
					System.out.println("No");
				}
			}
		}

		sc.close();
	}

}

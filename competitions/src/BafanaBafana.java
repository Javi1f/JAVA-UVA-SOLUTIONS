import java.util.Scanner;

public class BafanaBafana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {

			int n = sc.nextInt();
			int k = sc.nextInt();
			int p = sc.nextInt();

			System.out.println("Case " + (i + 1) + ": " + ((((k - 1) + p) % n) + 1));

		}
		sc.close();
	}

}

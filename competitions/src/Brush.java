import java.util.Scanner;

public class Brush {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			sc.nextLine();

			int a = sc.nextInt();
			int sum = 0;
			for (int j = 0; j < a; j++) {
				int x = sc.nextInt();
				if (x >= 1) {
					sum += x;
				}
			}
			if (sum >= 1) {
				System.out.println("Case " + (i + 1) + ": " + sum);
			} else {
				System.out.println("Case " + (i + 1) + ": " + 0);

			}
			sc.close();
		}
	}
}

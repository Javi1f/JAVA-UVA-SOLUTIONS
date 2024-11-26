import java.util.Scanner;

public class EmoogleBalance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		int cases = 1;
		while ((n = sc.nextInt()) != 0) {

			int a = 0;
			int b = 0;

			for (int i = 0; i < n; i++) {
				int temp = sc.nextInt();

				if (temp == 0) {
					b++;
				} else {
					a++;
				}
			}
			System.out.println("Case " + cases++ + ": " + (a - b));
		}
		sc.close();
	}

}

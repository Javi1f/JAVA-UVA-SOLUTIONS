import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int x = sc.nextInt();

			if (x <= 10) {
				System.out.println(x + " " + 0);
			} else if (x > 10) {
				System.out.println(10 + " " + (x - 10));
			}

		}
		sc.close();
	}

}

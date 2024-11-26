import java.util.Scanner;

public class SearchingNessy {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			int b = sc.nextInt();

			if ((a * b) % 9 == 0) {
				System.out.println((a * b) / 9);
			} else {
				System.out.println(((a * b) / 9) - ((2 * a) + (b - 2)));
			}

		}
	}

}

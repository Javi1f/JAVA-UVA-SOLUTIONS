import java.util.Scanner;

public class King {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int x = 0;
		int y = 0;

		Float d = 0f;

		for (int i = 0; i < n; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			d += (float) Math.sqrt(Math.pow((x1 - x), 2) + Math.pow((y1 - y), 2));

			x = x1;
			y = y1;
		}

		System.out.println(d / n);
		sc.close();
	}

}

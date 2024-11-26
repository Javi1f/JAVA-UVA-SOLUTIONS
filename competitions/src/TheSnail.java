import java.util.Scanner;

public class TheSnail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int h = 1;

		while ((h = sc.nextInt()) != 0) {
			float u = sc.nextInt();
			float d = sc.nextInt();
			float f = sc.nextInt();

			int count = 0;
			boolean failure = false;
			float calc = 0;
			float hei = u;
			float dist = u * (f / 100);
			do {
				count++;

				calc += (hei);
				if (calc > h) {
					failure = true;
					break;
				}
				calc -= d;
				if (calc < 0) {
					break;
				}

				hei -= dist;
				if (hei < 0) {
					hei = 0;

				}

			} while (true);

			if (failure) {
				System.out.println("success on day " + (count));
			} else {
				System.out.println("failure on day " + (count));
			}

		}
		sc.close();
	}
}

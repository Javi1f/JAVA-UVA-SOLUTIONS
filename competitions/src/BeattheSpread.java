import java.util.Scanner;

public class BeattheSpread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			long a = sc.nextInt();
			long b = sc.nextInt();
			boolean conf = false;
			if (b > a || (a % 2 == 0 && b % 2 != 0) || (a % 2 != 0 && b % 2 == 0) || a < 0 || b < 0) {
				System.out.println("impossible");
				conf = true;
			}

			if (!conf) {

				if (a % 2 == 0) {
					System.out.println(((a / 2) + (b / 2)) + " " + (Math.abs((a / 2) - (b / 2))));
				} else {
					long x = (a / 2) + (b / 2);
					long y = Math.abs((a / 2) - (b / 2));

					if (x > y) {
						System.out.println((x + 1) + " " + (y));
					} else {
						System.out.println((x) + " " + (y + 1));
					}

				}

			}

		}
		sc.close();
	}

}

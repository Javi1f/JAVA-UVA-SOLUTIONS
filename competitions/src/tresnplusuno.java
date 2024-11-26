import java.util.Scanner;

public class tresnplusuno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int count = 1;

			if (i > j) {
				for (int k = j; k <= i; k++) {
					if (calc(k) > count) {
						count = calc(k);
					}
				}
			} else {
				for (int k = i; k <= j; k++) {
					if (calc(k) > count) {
						count = calc(k);
					}
				}
			}
			System.out.println(i + " " + j + " " + count);

		}
		sc.close();

	}

	public static int calc(int num) {

		int count = 0;
		long n = num;
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (3 * n) + 1;
			}
			count++;
		}

		return count + 1;
	}

}

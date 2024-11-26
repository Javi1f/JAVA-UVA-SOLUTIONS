import java.util.HashMap;
import java.util.Scanner;

public class FactorialYouMustbeKidding {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Long> map = new HashMap<>();

		map.put(1, 1L);
		long temp = 1;
		for (int i = 2; i <= 13; i++) {
			temp *= i;
			map.put(i, temp);
		}

		int n;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			if ((n < 0 && n % 2 == 0)) {

				System.out.println("Underflow!");

			} else if ((n < 0 && n % 2 != 0)) {

				System.out.println("Overflow!");

			} else if (n < 8) {

				System.out.println("Underflow!");

			} else if (n > 13) {

				System.out.println("Overflow!");

			} else {
				System.out.println(map.get(n));
			}

		}

		sc.close();

	}
}

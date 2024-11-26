import java.util.ArrayList;
import java.util.Scanner;

public class BrickWallPatterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> fib = new ArrayList<>();
		long a = 1;
		long b = 1;
		fib.add(1l);
		for (int i = 0; i < 50; i++) {
			long act = a + b;
			fib.add(act);
			a = b;
			b = act;
		}

		int n;
		while ((n = sc.nextInt()) != 0) {

			System.out.println(fib.get(n - 1));

		}

		sc.close();
	}

}

import java.io.IOException;
import java.util.Scanner;

public class memorablenumber {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			int a = sc.nextInt();
			double sum = 0;
			for (int j = 0; j < a; j++) {

				double x = sc.nextDouble();
				double y = sc.nextDouble();
				double z = sc.nextDouble();

				if (y != 0) {
					double calc = (x / y) * z * y;

					sum += calc;
				}
			}
			System.out.println(String.format("%.0f", sum));
		}
		sc.close();
	}

}

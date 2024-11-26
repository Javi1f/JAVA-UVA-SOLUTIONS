import java.util.Scanner;

public class SummationofPolynomials {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			long n = sc.nextInt();

			System.out.println((n * (n + 1) / 2) * (n * (n + 1) / 2));
		}
		sc.close();
	}

}

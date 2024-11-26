import java.util.Scanner;

public class PizzaCutting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = 0;
		while ((n = sc.nextInt()) >= 0) {

			System.out.println(((n * (n + 1)) / 2 + 1));

		}
		sc.close();
	}

}

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;
		while ((n = sc.nextInt()) > 0) {

			System.out.println(Integer.toString(n, 3));

		}
		sc.close();
	}

}

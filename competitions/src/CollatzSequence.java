import java.io.IOException;
import java.util.Scanner;

public class CollatzSequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int a = 1;
		int b = 1;
		int count = 1;
		while (a >= 1) {
			a = sc.nextInt();
			b = sc.nextInt();
			long aux = a;
			String sum = "";
			for (int i = 0; i < b; i++) {
				if (aux == 1 || sum.length() > b) {
					System.out.println(
							"Case " + count + ": A = " + a + ", limit = " + b + ", number of terms = " + (i + 1));
					break;
				}
				if (aux % 2 == 0) {
					aux = aux / 2;
				} else {
					aux = (aux * 3) + 1;
					sum += aux;
					if (aux > b) {
						System.out.println(
								"Case " + count + ": A = " + a + ", limit = " + b + ", number of terms = " + (i + 1));
						break;
					}
				}
			}
			count++;

		}
		sc.close();
	}

}

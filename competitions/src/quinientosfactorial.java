import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class quinientosfactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> temp = new ArrayList<>();
		BigInteger b = BigInteger.ONE;
		temp.add(1 + "");
		temp.add(1 + "");

		for (int i = 2; i <= 1000; i++) {

			b = b.multiply(BigInteger.valueOf(i));
			temp.add(b.toString());

		}

		int n;
		while (sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println(n + "!\n" + temp.get(n));

		}

		sc.close();
	}

}

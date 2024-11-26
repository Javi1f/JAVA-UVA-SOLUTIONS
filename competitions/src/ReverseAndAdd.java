
import java.util.Scanner;

public class ReverseAndAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			long num = sc.nextLong();
			int n = 0;
			while (true) {

				num = num + Long.parseLong(new StringBuilder(num + "").reverse().toString());
				n++;
				if ((num + "").equals(new StringBuilder(num + "").reverse().toString())) {
					break;
				}

			}

			System.out.println(n + " " + num);

		}
		sc.close();
	}

}

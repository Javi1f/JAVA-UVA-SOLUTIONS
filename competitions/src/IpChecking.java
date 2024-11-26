import java.io.IOException;
import java.util.Scanner;

public class IpChecking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {

			if (i == 0) {
				sc.nextLine();
			}
			String a = sc.nextLine();
			String[] b = sc.nextLine().split("\\.");

			for (int j = 0; j < b.length; j++) {
				b[j] = Integer.parseInt(b[j], 2) + "";
			}
			String result = "";
			for (int j = 0; j < b.length; j++) {
				result += b[j] + ".";
			}

			if (a.equals(result.substring(0, result.length() - 1))) {
				System.out.println("Case " + (i + 1) + ": Yes");
			} else {
				System.out.println("Case " + (i + 1) + ": No");
			}

		}
		sc.close();
	}

}

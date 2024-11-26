import java.util.Scanner;

public class IdentiFyingTea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			int n = sc.nextInt();
			int count = 0;
			for (int i = 0; i < 5; i++) {
				int a = sc.nextInt();
				if (a == n) {
					count++;
				}
			}

			System.out.println(count);

		}
		sc.close();
	}

}

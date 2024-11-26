import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = 0; j < 4; j++) {
				sum += sc.nextInt();
			}
			System.out.println(sum);
		}
		sc.close();
	}

}

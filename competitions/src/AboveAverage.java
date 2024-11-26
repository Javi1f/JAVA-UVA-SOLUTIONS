import java.util.Scanner;

public class AboveAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {

			int n = sc.nextInt();
			int[] alumns = new int[n];
			for (int j = 0; j < n; j++) {
				alumns[j] = sc.nextInt();
			}

			float avg = 0;

			for (int j = 0; j < alumns.length; j++) {
				avg += alumns[j];
			}

			avg = avg / n;
			int count = 0;

			for (int j = 0; j < alumns.length; j++) {
				if (alumns[j] > avg) {
					count++;
				}
			}

			float per = (count * 100.0f) / n;
			System.out.printf("%.3f" + "%%" + "\n", per);
		}
		sc.close();
	}

}

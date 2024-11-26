
import java.util.Scanner;

public class Better {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] x = new int[n];
		int[] d = new int[n];

		for (int i = 0; i < n; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			d[i] = sc.nextInt();
		}

		int countx = 0;
		int countd = 0;
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < x.length; j++) {
				if (d[i] > x[j]) {
					countd++;
				} else if (d[i] < x[j]) {
					countx++;
				}
			}
		}
		if (countx > countd) {
			System.out.println("first");
		} else if (countd > countx) {
			System.out.println("second");
		} else {
			System.out.println("tie");
		}
		sc.close();
	}

}

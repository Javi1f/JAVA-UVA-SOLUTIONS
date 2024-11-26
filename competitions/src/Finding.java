import java.util.Arrays;
import java.util.Scanner;

public class Finding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] vect = new int[n];
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextInt();
		}
		Arrays.sort(vect);

		System.out.println(vect[0] + vect[1]);
		sc.close();
	}

}

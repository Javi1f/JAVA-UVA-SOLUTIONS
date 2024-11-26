import java.util.ArrayList;
import java.util.Scanner;

public class Joystick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Character> abc = new ArrayList<Character>();

		for (int i = 0; i < 26; i++) {
			abc.add((char) ('A' + i));
		}

		int x = sc.nextInt();
		sc.nextLine();
		String usera = sc.nextLine();
		String userb = sc.nextLine();

		char[] a = usera.toCharArray();
		char[] b = userb.toCharArray();

		int movements = 0;
		for (int i = 0; i < x; i++) {
			int sum = Math.abs(abc.indexOf(a[i]) - abc.indexOf(b[i]));

			if (sum > abc.size() / 2) {
				sum = abc.size() - sum;
			}

			movements += sum;
		}
		System.out.println(movements);
		sc.close();
	}

}

import java.util.Scanner;

public class AsciiProgressBar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();
		float number = Float.parseFloat(line.replace(".", "."));
		double near = Math.floor(number);
		if (near % 10 != 0) {
			near = near - near % 10;
		}
		if (near == 0) {
			System.out.println("[..........] " + Math.round(number) + "%");
		} else if (near == 10) {
			System.out.println("[+.........] " + Math.round(number) + "%");
		} else if (near == 20) {
			System.out.println("[++........] " + Math.round(number) + "%");

		} else if (near == 30) {
			System.out.println("[+++.......] " + Math.round(number) + "%");

		} else if (near == 40) {
			System.out.println("[++++......] " + Math.round(number) + "%");

		} else if (near == 50) {
			System.out.println("[+++++.....] " + Math.round(number) + "%");

		} else if (near == 60) {
			System.out.println("[++++++....] " + Math.round(number) + "%");

		} else if (near == 70) {
			System.out.println("[+++++++...] " + Math.round(number) + "%");

		} else if (near == 80) {
			System.out.println("[++++++++..] " + Math.round(number) + "%");

		} else if (near == 90) {
			System.out.println("[+++++++++.] " + Math.round(number) + "%");

		} else if (near == 100) {
			System.out.println("[++++++++++] " + Math.round(number) + "%");

		}
		sc.close();
	}

}

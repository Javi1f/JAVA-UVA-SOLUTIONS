import java.util.Scanner;

public class ICPCtoLCPC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		System.out.println(isBisiesto(number) ? "I can participate in LCPC" : "I have to travel back to the past");
		sc.close();

	}

	static boolean isBisiesto(int number) {

		if (number < 1582) {

			if (number % 4 == 0) {
				return true;
			}
			return false;

		} else {

			if ((number % 4 == 0 && number % 100 != 0) || number % 400 == 0) {
				return true;
			}

			return false;
		}

	}

}

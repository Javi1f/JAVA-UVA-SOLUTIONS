import java.util.Scanner;

public class beiju {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = sc.nextLine();

		String temp = "";
		for (int i = 0; i < line.length(); i++) {
			int ab = line.indexOf("[");
			int cl = line.indexOf("]");

			temp = line.substring(ab, cl) + line.substring(cl);

		}
		for (int i = 0; i < temp.charAt(i); i++) {

		}
		sc.close();
	}

}
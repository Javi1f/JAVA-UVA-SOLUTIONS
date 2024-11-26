import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsThisTheEasiestProblem {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {

			String[] line = bf.readLine().split(" ");

			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int c = Integer.parseInt(line[2]);

			if (isValid(a, b, c)) {

				if (a == b && b == c && a == c) {
					System.out.println("Case " + (i + 1) + ": Equilateral");
				} else if ((a == b && b != c) || (a != b && b == c) || (a == c && b != a)) {
					System.out.println("Case " + (i + 1) + ": Isosceles");
				} else {
					System.out.println("Case " + (i + 1) + ": Scalene");
				}

			} else {
				System.out.println("Case " + (i + 1) + ": Invalid");
			}

		}
	}

	static boolean isValid(int a, int b, int c) {

		if (a + b > c && a + c > b && b + c > a) {
			return true;
		} else {
			return false;
		}

	}
}

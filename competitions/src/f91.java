import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class f91 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n;

		while ((n = Integer.parseInt(bf.readLine())) != 0) {

			System.out.println("f91(" + n + ") = " + f91f(n));

		}
	}

	public static int f91f(int n) {
		if (n <= 100) {
			return f91f(f91f(n + 11));
		} else {
			return n - 10;
		}
	}
}

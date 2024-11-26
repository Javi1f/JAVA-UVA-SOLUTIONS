import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PowerCrisis {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while (!(line = bf.readLine()).equals("0")) {

			System.out.println(min(Integer.parseInt(line), 13));
		}

	}

	static int min(int n, int target) {
		int min = 0;
		for (int k = 1; k < n + 1; k++) {
			for (int i = 1; i < n + 1; i++) {
				if (josepe(n, k) == target) {
					min = i;
					return min;
				}
			}
		}
		return min;
	}

	static int josepe(int n, int k) {
		if (n == 1) {
			return n;
		}

		return (josepe(n - 1, k) + k - 1) % n + 1;

	}

}

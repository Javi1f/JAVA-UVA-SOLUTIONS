import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Golem {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n - n; i++) {

		}
		String[] g = bf.readLine().split(" ");

		int[] golems = new int[g.length];
		for (int i = 0; i < g.length; i++) {
			golems[i] = Integer.parseInt(g[i]);
		}
		Arrays.sort(golems);
		int fuerza = 0;
		for (int i = 1; i < golems.length; i++) {
			fuerza += gcd(golems[i], golems[i - 1]);
		}
		System.out.println(fuerza);
	}

	public static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

}

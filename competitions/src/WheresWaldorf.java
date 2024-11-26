import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WheresWaldorf {

	static int m, n;
	static char[][] mx;
	static String line;
	static int[][] result;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {
			bf.readLine();
			String[] dm = bf.readLine().split(" ");
			m = Integer.parseInt(dm[0]);
			n = Integer.parseInt(dm[1]);
			mx = new char[m][n];
			for (int j = 0; j < m; j++) {
				mx[j] = bf.readLine().toLowerCase().toCharArray();
			}

			int let = Integer.parseInt(bf.readLine());

			for (int j = 0; j < let; j++) {
				line = bf.readLine().toLowerCase();
				sisas: for (int j2 = 0; j2 < mx.length; j2++) {
					for (int k = 0; k < mx[0].length; k++) {
						if (line.charAt(0) == mx[j2][k]) {
							boolean a = findLeft(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean b = findRight(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean c = findUp(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean d = findDown(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean e = findLDDiag(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean f = findRDDiag(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean g = findLUDiag(line.charAt(0), mx[j2][k], 0, j2, k);
							boolean h = findRUDiag(line.charAt(0), mx[j2][k], 0, j2, k);

							if (a || b || c || d || e || f || g || h) {

								System.out.println((j2 + 1) + " " + (k + 1));
								break sisas;
							}
						}
					}
				}

			}

			if (i < N - 1) {
				System.out.println();
			}

		}
	}

	static boolean isValid(int x, int y) {
		return x >= 0 && y >= 0 && x < m && y < n;
	}

	static boolean findLeft(char act, char temp, int pos, int x, int y) {
		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x - 1, y)) {
			return findLeft(line.charAt(pos + 1), mx[x - 1][y], pos + 1, x - 1, y);
		} else {
			return false;
		}
	}

	static boolean findRight(char act, char temp, int pos, int x, int y) {
		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x + 1, y)) {
			return findRight(line.charAt(pos + 1), mx[x + 1][y], pos + 1, x + 1, y);
		} else {
			return false;
		}
	}

	static boolean findUp(char act, char temp, int pos, int x, int y) {

		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x, y - 1)) {
			return findUp(line.charAt(pos + 1), mx[x][y - 1], pos + 1, x, y - 1);
		} else {
			return false;
		}
	}

	static boolean findDown(char act, char temp, int pos, int x, int y) {

		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x, y + 1)) {
			return findDown(line.charAt(pos + 1), mx[x][y + 1], pos + 1, x, y + 1);
		} else {
			return false;
		}
	}

	static boolean findLDDiag(char act, char temp, int pos, int x, int y) {

		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x - 1, y + 1)) {
			return findLDDiag(line.charAt(pos + 1), mx[x - 1][y + 1], pos + 1, x - 1, y + 1);
		} else {
			return false;
		}
	}

	static boolean findRDDiag(char act, char temp, int pos, int x, int y) {
		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x + 1, y + 1)) {
			return findRDDiag(line.charAt(pos + 1), mx[x + 1][y + 1], pos + 1, x + 1, y + 1);
		} else {
			return false;
		}
	}

	static boolean findLUDiag(char act, char temp, int pos, int x, int y) {

		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x - 1, y - 1)) {
			return findLUDiag(line.charAt(pos + 1), mx[x - 1][y - 1], pos + 1, x - 1, y - 1);
		} else {
			return false;
		}
	}

	static boolean findRUDiag(char act, char temp, int pos, int x, int y) {

		if (pos >= line.length() - 1 && temp == line.charAt(pos)) {
			return true;
		}

		if (line.charAt(pos) != temp) {
			return false;
		}

		if (isValid(x + 1, y - 1)) {
			return findRUDiag(line.charAt(pos + 1), mx[x + 1][y - 1], pos + 1, x + 1, y - 1);
		} else {
			return false;
		}
	}

}

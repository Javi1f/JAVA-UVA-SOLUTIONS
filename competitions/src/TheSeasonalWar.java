import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheSeasonalWar {
	static int n;
	static int[] dx = { 0, 1, 1, 1, 0, -1, -1, -1 }, dy = { 1, 1, 0, -1, -1, -1, 0, 1 };
	static char[][] mx;

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String line;
		int ind = 1;
		while ((line = bf.readLine()) != null) {
			if (line.equals("")) {
				break;
			}
			n = Integer.parseInt(line);
			mx = new char[n][n];
			for (int i = 0; i < n; i++) {
				mx[i] = bf.readLine().toCharArray();
			}
			int ans = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {

					if (mx[i][j] == '1') {
						ans++;
						floodFill(i, j);
					}

				}
			}

			sb.append("Image number " + ind + " contains " + ans + " war eagles.\n");

			ind++;
		}
		System.out.print(sb.toString());

	}

	static boolean isValid(int x, int y) {
		return x >= 0 && y >= 0 && x < n && y < n;
	}

	static void floodFill(int x, int y) {

		if (mx[x][y] == '0') {
			return;
		}
		mx[x][y] = '0';
		for (int i = 0; i < dx.length; i++) {
			int nx = x + dx[i], ny = y + dy[i];

			if (isValid(nx, ny)) {
				floodFill(nx, ny);

			}
		}

	}

}

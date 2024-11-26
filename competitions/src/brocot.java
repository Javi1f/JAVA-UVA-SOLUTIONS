import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class brocot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bf.readLine());

		for (int i = 0; i < N; i++) {

			String line = bf.readLine();

			long[] prev = { 0l, 1l };
			long[] next = { 1l, 0l };
			long[] act = { 1l, 1l };

			for (int j = 0; j < line.length(); j++) {
				if (line.charAt(j) == 'R') {
					prev[0] = act[0];
					prev[1] = act[1];
					long a = next[0] + act[0];
					long b = next[1] + act[1];
					act[0] = a;
					act[1] = b;
				} else {
					next[0] = act[0];
					next[1] = act[1];
					long a = prev[0] + act[0];
					long b = prev[1] + act[1];
					act[0] = a;
					act[1] = b;
				}
			}
			System.out.println(act[0] + "/" + act[1]);

		}

	}

}

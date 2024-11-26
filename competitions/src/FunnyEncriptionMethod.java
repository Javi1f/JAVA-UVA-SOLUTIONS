import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FunnyEncriptionMethod {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		for (int i = 0; i < n; i++) {

			String line = bf.readLine();
			String bin = Integer.toString(Integer.parseInt(line), 2);
			String hex = Integer.toString(Integer.parseInt(line, 16), 2);
			int countbin = 0;
			for (int j = 0; j < bin.length(); j++) {
				if (bin.charAt(j) == '1') {
					countbin++;
				}
			}
			int counthex = 0;
			for (int j = 0; j < hex.length(); j++) {
				if (hex.charAt(j) == '1') {
					counthex++;
				}
			}

			System.out.println(countbin + " " + counthex);
		}

	}

}

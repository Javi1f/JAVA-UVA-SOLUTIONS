import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubstringFrecuency {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());

		for (int i = 0; i < n; i++) {
			String a = bf.readLine();
			String b = bf.readLine();
			int count = 0;
			int index = a.indexOf(b);
			while (index != -1) {
				count++;
				if (a.indexOf(b) != -1) {
					a = a.substring(index);
					index = a.indexOf(b, index + 1);
				} else {
					break;
				}

			}
			System.out.println("Case " + (i + 1) + ": " + count);
		}

	}
}

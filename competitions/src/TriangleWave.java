import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleWave {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String n = bf.readLine();

		for (int i = 0; i < Integer.parseInt(n); i++) {

			String x = bf.readLine();
			x = x + "";
			String a = bf.readLine();
			String b = bf.readLine();

			for (int j = 0; j < Integer.parseInt(b); j++) {

				for (int j2 = 1; j2 <= Integer.parseInt(a); j2++) {

					for (int k = 0; k < j2; k++) {
						System.out.print(j2);
					}
					System.out.println();
				}
				for (int j2 = Integer.parseInt(a) - 1; j2 > 0; j2--) {

					for (int k = 0; k < j2; k++) {
						System.out.print(j2);
					}
					System.out.println();
				}
				System.out.println();

			}

		}

	}

}

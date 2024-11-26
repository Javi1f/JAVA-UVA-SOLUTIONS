import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Poetry {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		String x = bf.readLine();

		for (int i = 0; i < Integer.parseInt(x); i++) {

			String a = bf.readLine();
			String b = bf.readLine();

			String[] split = a.split("<");

			String line1 = split[1].substring(0, split[1].indexOf(">"));
			String line2 = split[2].substring(0, split[2].indexOf(">"));

			System.out.println(a.replace(">", "").replace("<", ""));

			System.out.println(					b.substring(0, b.indexOf(".")) + line2 + split[1].substring(split[1].indexOf(">")).replace(">", "")
							+ line1 + split[2].substring(split[2].indexOf(">")).replace(">", ""));
		}

	}
}

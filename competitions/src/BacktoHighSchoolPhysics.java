import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BacktoHighSchoolPhysics {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String line;

		while ((line = bf.readLine()) != null) {
			int v = Integer.parseInt(line.split(" ")[0]);
			int t = Integer.parseInt(line.split(" ")[1]);

			System.out.println(v * (t * 2));
		}

	}

}

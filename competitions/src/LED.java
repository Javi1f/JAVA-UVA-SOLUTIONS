import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LED {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String p = bf.readLine();

		ArrayList<String> lines = new ArrayList<>();

		for (int i = 0; i < Integer.parseInt(p.split(" ")[0]); i++) {
			lines.add(bf.readLine());
		}

		char[][] matrix1 = new char[Integer.parseInt(p.split(" ")[0])][Integer.parseInt(p.split(" ")[1])];
		char[][] matrix2 = new char[Integer.parseInt(p.split(" ")[0])][Integer.parseInt(p.split(" ")[2])];

		for (int i = 0; i < lines.size(); i++) {

			String[] split = lines.get(i).split(" ");
			int id = 0;
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = split[0].charAt(id);
				id++;
			}
			int id2 = 0;
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = split[1].charAt(id2);
				id2++;
			}
		}

		if (verify(matrix1, matrix2)) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}

	}

	static boolean verify(char[][] matrix1, char[][] matrix2) {
		for (int i = 0; i < matrix2[0].length; i++) {
			char[] temp = new char[matrix2.length];
			for (int j = 0; j < matrix2.length; j++) {
				temp[j] = matrix2[j][i];
			}

			for (int j2 = 0; j2 < matrix1[0].length; j2++) {
				for (int k = 0; k < matrix1.length; k++) {
					if ((matrix1[k][j2] == '-') && (temp[k] == '*')) {
						return false;
					}
				}

			}
		}

		return true;
	}

	
}

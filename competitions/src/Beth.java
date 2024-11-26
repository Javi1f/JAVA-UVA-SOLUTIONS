import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beth {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bf.readLine());
		String cad = bf.readLine();
		for (int i = 0; i < n - n; i++) {

		}
		System.out.println((modificarParentesis(cad)));

	}

	public static String modificarParentesis(String cadena) {

		StringBuffer sb = new StringBuffer();
		sb.append(cadena);
		int sum = 0;
		for (int i = 1; i < cadena.length(); i++) {

			if ((cadena.charAt(i - 1) + "" + cadena.charAt(i)).equals(")(")) {
				sb.insert(i + sum, "*");
				sum++;
			} else if ((cadena.charAt(i - 1) + "" + cadena.charAt(i)).equals("()")) {
				sb.insert(i + sum, "1");
				sum++;
			} else if ((cadena.charAt(i - 1) + "" + cadena.charAt(i) + "").equals("))")) {
				sb.insert(i + sum, "+1");
				sum += 2;
			}
		}

		return sb.toString();
	}

}

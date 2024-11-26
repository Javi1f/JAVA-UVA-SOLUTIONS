import java.util.Scanner;
import java.util.TreeMap;

public class Conquests {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		TreeMap<String, Integer> country = new TreeMap<String, Integer>();

		for (int i = 0; i < n + 1; i++) {

			String in = sc.nextLine();

			String[] let = in.split(" ");

			if (i != 0) {
				if (country.containsKey(let[0])) {
					country.put(let[0], country.get(let[0]) + 1);
				} else {
					country.put(let[0], 1);
				}
			}
		}
		for (String key : country.keySet()) {

			System.out.println(key + " " + country.get(key));
		}
		sc.close();
	}

}

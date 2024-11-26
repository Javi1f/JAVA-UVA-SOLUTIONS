import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.TreeMap;

public class Pattern {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		TreeMap<String, Integer> mapto = new TreeMap<>();

		String n = bf.readLine();

		String x = n.split(" ")[0];
		String y = n.split(" ")[1];
		BigInteger count = BigInteger.ONE;
		while (true) {
			mapto = new TreeMap<>();
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < x.length(); i++) {

				if (mapto.containsKey(x.charAt(i) + "")) {
					mapto.put(x.charAt(i) + "", mapto.get(x.charAt(i) + "") + 1);
				} else {
					mapto.put(x.charAt(i) + "", 1);
				}
			}
			for (String en : mapto.keySet()) {

				sb.append(mapto.get(en) + en);
			}
			

			count = count.add(BigInteger.ONE);

			if (sb.toString().contains(y)) {
				System.out.println(count);
				break;
			}

			if (sb.toString().length() > 100) {
				System.out.println("I’m bored");
				break;
			}else if (sb.toString().equals(x)) {
				System.out.println("Does not appear");
				break;
			}
			x = sb.toString();
		}
	}

}

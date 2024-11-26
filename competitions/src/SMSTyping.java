import java.util.HashMap;
import java.util.Scanner;

public class SMSTyping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<Character, Integer> mapto = new HashMap<>();
		mapto.put('a', 1);
		mapto.put('b', 2);
		mapto.put('c', 3);
		mapto.put('d', 1);
		mapto.put('e', 2);
		mapto.put('f', 3);
		mapto.put('g', 1);
		mapto.put('h', 2);
		mapto.put('i', 3);
		mapto.put('j', 1);
		mapto.put('k', 2);
		mapto.put('l', 3);
		mapto.put('m', 1);
		mapto.put('n', 2);
		mapto.put('o', 3);
		mapto.put('p', 1);
		mapto.put('q', 2);
		mapto.put('r', 3);
		mapto.put('s', 4);
		mapto.put('t', 1);
		mapto.put('u', 2);
		mapto.put('v', 3);
		mapto.put('w', 1);
		mapto.put('x', 2);
		mapto.put('y', 3);
		mapto.put('z', 4);
		mapto.put(' ', 1);

		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {

			String line = sc.nextLine();
			int count = 0;

			for (int j = 0; j < line.length(); j++) {
				char t = line.charAt(j);
				count += mapto.get(t);
			}

			System.out.println("Case #" + (i + 1) + ": " + count);

		}
		sc.close();
	}
}

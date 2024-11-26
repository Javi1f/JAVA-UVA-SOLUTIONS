import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class QueueSimul {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(bf.readLine());

		for (int i = 0; i < T; i++) {
			System.out.println("Case " + (i + 1) + ":");
			String[] line = bf.readLine().split(" ");
			LinkedList<String> list = new LinkedList<>();
			for (int j = 0; j < Integer.parseInt(line[1]); j++) {
				String[] temp = bf.readLine().split(" ");
				if (temp[0].equals("pushLeft")) {
					if (list.size() == Integer.parseInt(line[0])) {
						System.out.println("The queue is full");
					} else {
						list.addFirst(temp[1]);
						System.out.println("Pushed in left: " + temp[1]);
					}
				} else if (temp[0].equals("pushRight")) {
					if (list.size() == Integer.parseInt(line[0])) {
						System.out.println("The queue is full");
					} else {
						list.addLast(temp[1]);
						System.out.println("Pushed in right: " + temp[1]);
					}
				} else {
					if (list.isEmpty()) {
						System.out.println("The queue is empty");
					} else if (temp[0].contains("Right")) {
						System.out.println("Popped from right: " + list.getLast());
						list.removeLast();
					} else {
						System.out.println("Popped from left: " + list.getFirst());
						list.removeFirst();
					}

				}
			}

		}

	}

}

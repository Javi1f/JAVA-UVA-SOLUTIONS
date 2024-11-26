import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecodeTheMadMan {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String norm = " abcdefghijklmnopqrstuvwxyz`1234567890-=[];',./\\\\";
		String ap = "  czaqsdfyghjbvui w etx  r   `1234567890opklnm,[";

		String line = bf.readLine().toLowerCase();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == ' ') {
				sb.append(" ");
			} else {
				sb.append(ap.charAt(norm.indexOf(line.charAt(i))));
			}
		}
		System.out.println(sb.toString());

	}

}

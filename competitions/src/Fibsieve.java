import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibsieve {

	static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		long entrada = Long.parseLong(bf.readLine());
		int nmatrix = (int) Math.ceil(Math.sqrt(entrada));
		long[][] sisas = new long[nmatrix][nmatrix];

		fillMatrix(sisas, nmatrix);
		printMatrix(sisas);

	}

	public static void fillMatrix(long[][] matrix, int n){
        int value = n * n;
        int minCol = 0;
        int maxCol = n - 1;
        int minRow = 0;
        int maxRow = n - 1;

        while (value >= 1) {
            for (int i = minRow; i <= maxRow; i++) {
                matrix[i][minCol] = value;
                value--;
            }
            minCol++;

            for (int i = minCol; i <= maxCol; i++) {
                matrix[maxRow][i] = value;
                value--;
            }
            maxRow--;

            for (int i = maxRow; i >= minRow; i--) {
                matrix[i][maxCol] = value;
                value--;
            }
            maxCol--;

            for (int i = maxCol; i >= minCol; i--) {
                matrix[minRow][i] = value;
                value--;
            }
            minRow++;
        }
    }
	static void printMatrix(long[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}

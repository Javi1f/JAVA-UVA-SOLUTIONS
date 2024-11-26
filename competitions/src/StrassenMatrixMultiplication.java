
public class StrassenMatrixMultiplication {

	public static int[][] multiply(int[][] A, int[][] B) {
		int n = A.length;
		int[][] result = new int[n][n];

		if (n == 1) {
			result[0][0] = A[0][0] * B[0][0];
		} else {
			int[][] A11 = divideMatrix(A, 0, 0);
			int[][] A12 = divideMatrix(A, 0, n / 2);
			int[][] A21 = divideMatrix(A, n / 2, 0);
			int[][] A22 = divideMatrix(A, n / 2, n / 2);

			int[][] B11 = divideMatrix(B, 0, 0);
			int[][] B12 = divideMatrix(B, 0, n / 2);
			int[][] B21 = divideMatrix(B, n / 2, 0);
			int[][] B22 = divideMatrix(B, n / 2, n / 2);

			int[][] P1 = multiply(addMatrices(A11, A22), addMatrices(B11, B22));
			int[][] P2 = multiply(addMatrices(A21, A22), B11);
			int[][] P3 = multiply(A11, subtractMatrices(B12, B22));
			int[][] P4 = multiply(A22, subtractMatrices(B21, B11));
			int[][] P5 = multiply(addMatrices(A11, A12), B22);
			int[][] P6 = multiply(subtractMatrices(A21, A11), addMatrices(B11, B12));
			int[][] P7 = multiply(subtractMatrices(A12, A22), addMatrices(B21, B22));

			int[][] C11 = addMatrices(subtractMatrices(addMatrices(P1, P4), P5), P7);
			int[][] C12 = addMatrices(P3, P5);
			int[][] C21 = addMatrices(P2, P4);
			int[][] C22 = addMatrices(subtractMatrices(addMatrices(P1, P3), P2), P6);

			joinMatrices(C11, result, 0, 0);
			joinMatrices(C12, result, 0, n / 2);
			joinMatrices(C21, result, n / 2, 0);
			joinMatrices(C22, result, n / 2, n / 2);
		}

		return result;
	}

	private static int[][] divideMatrix(int[][] matrix, int startRow, int startCol) {
		int n = matrix.length / 2;
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = matrix[i + startRow][j + startCol];
			}
		}
		return result;
	}

	private static void joinMatrices(int[][] subMatrix, int[][] result, int startRow, int startCol) {
		int n = subMatrix.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i + startRow][j + startCol] = subMatrix[i][j];
			}
		}
	}

	private static int[][] addMatrices(int[][] A, int[][] B) {
		int n = A.length;
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		return result;
	}

	private static int[][] subtractMatrices(int[][] A, int[][] B) {
		int n = A.length;
		int[][] result = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = A[i][j] - B[i][j];
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int[][] A = fill(8, 8);
		int[][] B = fill(8, 8);

		int[][] result = multiply(A, B);
		int[][] resultFB = multiplicationFB(A, B);

		System.out.println("Matrix A:");
		printMatrix(A);
		System.out.println("\nMatrix B:");
		printMatrix(B);
		System.out.println("\nResult:");
		printMatrix(result);
		System.out.println("\nResult FB:");
		printMatrix(resultFB);
	}

	static int[][] fill(int rows, int columns) {

		int[][] matrix = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = (i + j) + 1;
			}
		}

		return matrix;

	}

	public static int[][] multiplicationFB(int[][] a, int[][] b) {

		int rowsA = a.length;
		int columnsA = a[0].length;
		int columnsB = b[0].length;

		int[][] c = new int[rowsA][columnsB];

		for (int i = 0; i < rowsA; i++) {
			for (int j = 0; j < columnsB; j++) {
				for (int k = 0; k < columnsA; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return c;
	}

	private static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int cell : row) {
				System.out.print(cell + " ");
			}
			System.out.println();
		}
	}
}

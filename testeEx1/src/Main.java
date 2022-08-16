
public class Main {

	public static void resetMatrix(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] != 0) {
					mat[i][j] = 1;
				}
			}
		}
	}

	public static int findMaxRectArea(int[][] mat) {

		if (mat == null || mat.length == 0) {
			return 0;
		}

		int M = mat.length;
		int N = mat[0].length;

		for (int j = 0; j < N; j++) {
			for (int i = M - 2; i >= 0; i--) {
				if (mat[i][j] == 1) {
					mat[i][j] = mat[i + 1][j] + 1;
				}
			}
		}

		int maxArea = 0;

		for (int i = 0; i < M; i++) {
			int[] count = new int[M + 1];

			for (int j = 0; j < N; j++) {
				if (mat[i][j] > 0) {
					count[mat[i][j]] += 1;

					maxArea = Integer.max(maxArea, mat[i][j] * count[mat[i][j]]);
				}
			}
		}

		resetMatrix(mat);
		return maxArea;
	}

	public static void main(String[] args) {
		int[][] mat = { 
				{ 1, 0, 1, 0, 0 },
				{ 1, 0, 1, 1, 1 },
				{ 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 1, 0 }	
		};

		System.out.println("Retangula com a maior area" + findMaxRectArea(mat));
	}

}

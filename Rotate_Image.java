// https://leetcode.com/problems/rotate-image/

// rotate: (i,j) ->(j,n-1-i) ->(n-1-i,n-1-j) ->(n-1-j,i) ->(i,j)
public class Rotate_Image { // O(n^2)
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for (int j = 0; j < n / 2; j++) {
			for (int i = j; i <= n - j - 2; i++) {
				rotate4(matrix, i, j, j, n - 1 - i, n - 1 - i, n - 1 - j, n - 1 - j, i);
			}
		}
	}

	public static void rotate4(int[][] m, int i1, int j1, int i2, int j2, int i3, int j3, int i4, int j4) {
		if (i1 == i2 && i3 == i4 && i1 == i3)
			return;
		int temp = m[i1][j1];
		m[i1][j1] = m[i4][j4];
		m[i4][j4] = m[i3][j3];
		m[i3][j3] = m[i2][j2];
		m[i2][j2] = temp;
	}

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(matrix);
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
			/*
			 * 7 4 1 
			 * 8 5 2 
			 * 9 6 3
			 */
		}
	}
}

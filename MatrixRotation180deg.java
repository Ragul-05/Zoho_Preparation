public class MatrixRotation180deg {
   public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = arr.length;
        int m = arr[0].length;

        int[][] result = new int[n][m];

        // Add arr[i][j] + arr[n-1-i][m-1-j]
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = arr[i][j] + arr[n - 1 - i][m - 1 - j];
            }
        }

        // Print the result
        for (int[] row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
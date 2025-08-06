public class matrixsum {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] B = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};
        int[][] C = {{0, 1, 0, 1}, {1, 0, 1, 0}, {0, 0, 1, 1}};
        int[][] sum = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i][j] = A[i][j] + B[i][j] + C[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}

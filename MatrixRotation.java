public class MatrixRotation {
    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row //for clockwise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
        // Step 2: Reverse each column //for anticlockwise
        // for (int i = 0; i < n / 2; i++) {
        //     for (int j = 0; j < n; j++) {
        //         int temp = matrix[i][j];
        //         matrix[i][j] = matrix[n - 1 - i][j];
        //         matrix[n - 1 - i][j] = temp;
        //     }
        // }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotateMatrix(matrix);

        System.out.println("Rotated Matrix by 90 degrees clockwise:");
        printMatrix(matrix);
    }
}

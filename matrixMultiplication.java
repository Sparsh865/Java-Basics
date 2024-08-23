import java.util.*;
public class matrixMultiplication {

    public static int[][] multiplyMatrix(int[][] matrix1,int[][]matrix2){
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;

        int[][] resultMatrix = new int[row1][col2];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                resultMatrix[i][j]=0;

                for(int k=0;k<col1;k++){
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return resultMatrix;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();

        int[][] matrix1 = new int[row1][col1];
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                matrix1[i][j] = sc.nextInt();
            }
        }

        int row2 = sc.nextInt();
        int col2 = sc.nextInt();

        int[][] matrix2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        if(col1!=row2){
            System.out.println("Wrong Inputs");
            return;
        }

        int[][] resultMatrix = multiplyMatrix(matrix1,matrix2);

        for(int i=0;i<resultMatrix.length;i++){
            for(int j=0;j<resultMatrix[0].length;j++){
                System.out.print(resultMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

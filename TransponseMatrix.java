import java.util.*;

public class TransponseMatrix {

    public static int[][] transpose(int[][] matrix){
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposeMatrix = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int [][] transposeMatrix = transpose(matrix);

        for(int i=0;i<transposeMatrix.length;i++){
            for(int j=0;j<transposeMatrix[i].length;j++){
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}

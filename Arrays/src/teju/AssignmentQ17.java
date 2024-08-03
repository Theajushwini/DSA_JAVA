package teju;
import java.util.Scanner;
import java.util.Arrays;
public class AssignmentQ17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int m = in.nextInt();
        System.out.println("Enter no of columns");
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int[][] transpose = transpose(matrix);
        System.out.println(Arrays.toString(transpose));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {

                    transpose[i][j] = matrix[j][i];

            }

        }
        return transpose;
    }
}

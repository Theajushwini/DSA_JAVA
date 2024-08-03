package teju;

public class AssignmentQ14 {
    public static void main(String[] args) {
        int[][] mat={{1,2,3},
                {4,5,6},{7,8,9}};
        int sum=diagonalSum(mat);
        System.out.println(sum);
    }
    public static  int diagonalSum(int[][] mat){
        int sum=0;
        int n=mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j||n-i==j){
                    sum=sum+mat[i][j];
                }
            }
        }
        return sum;

    }
}

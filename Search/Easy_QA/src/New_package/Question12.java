package New_package;

public class Question12 {
    public static void main(String[] args) {
        int[][] grid={
                {4,3,2,-1},
                {3,2,1,-1},
                {1,1,-1,-2},
                {-1,-1,-2,-3}
        };
        System.out.println(countNegatives(grid));
    }
    public static int countNegatives(int[][] grid){
        int row=grid[0].length-1;
        int col=0;
        int count=0;
        while(row>=0 && col<grid[0].length){
            if(grid[row][col]<0){
                count=count+(grid[0].length-col);
                row--;
            }
            else{
                col++;
            }
        }
        return count;

    }
}

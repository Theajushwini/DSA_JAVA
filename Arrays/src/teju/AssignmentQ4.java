package teju;
import java.util.Scanner;
public class AssignmentQ4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int m=in.nextInt();
        System.out.println("Enter the number of rows:");
        int n=in.nextInt();
        int[][] accounts=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[i][j]=in.nextInt();
            }
        }
        int max_wealth=maximumWealth(accounts);
        System.out.println("The max wealth is :"+max_wealth);

    }
    public static  int maximumWealth(int[][] accounts) {
        int[] wealth=new int[accounts.length];
        int max_wealth=1;
        for(int i=0;i<accounts.length;i++){
            wealth[i]=0;
            for(int j=0;j<accounts[i].length;j++){

                wealth[i]=wealth[i]+accounts[i][j];
            }
            if(wealth[i]>max_wealth){
                max_wealth=wealth[i];
            }
        }

        return max_wealth;
    }
}

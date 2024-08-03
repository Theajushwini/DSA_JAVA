package teju_practice;
import java.util.Scanner;

public class Averagennumb {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=in.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;

        }
        int avg =sum/n;
        System.out.println("The average of  numbers is :"+ avg);
    }}

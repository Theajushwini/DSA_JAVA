package teju_practice;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find its factorial:");
     int n=in.nextInt();
     int fact=1;
     for(int i=n;i>0;--i){
         fact=fact*i;
     }
        System.out.println("The factorial value is: "+fact);
    }
}

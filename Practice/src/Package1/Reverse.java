package Package1;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to find its reverse:");
        int n=in.nextInt();
        int rem=0;
        int a=0;
        while(n>0){
            rem=n%10;
            a=a*10+rem;
            n=n/10;

        }
        if(a==n){
            System.out.println("The number is armstrong");
        }
        System.out.println("the reverse is :"+a);

    }
}

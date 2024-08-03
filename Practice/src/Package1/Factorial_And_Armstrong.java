package Package1;
import java.util.Scanner;

public class Factorial_And_Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number 'n'");
        int n=input.nextInt();
        System.out.println("Enter a number 'a");
        int a=input.nextInt();
        int rem=0;
        int fact=1;
        int  arms=0;
        int b=n;
        while(n>0){
            rem=n%10;
            arms=arms+rem*rem*rem;
            n=n/10;

        }
        if(arms==b){
            System.out.println("THe numberis armstrong");
        }
        while(a>0){
            fact=fact*a;
            a--;
        }
        System.out.println("factorial is "+fact);

    }
}

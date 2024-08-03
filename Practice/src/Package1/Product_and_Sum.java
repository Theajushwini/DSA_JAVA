package Package1;
import java.util.Scanner;
public class Product_and_Sum {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter a number:");
        int n=input.nextInt();
        int rem=0;
        int sum=0;
        int product=1;
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            product=product*rem;
            n=n/10;
        }
        int result=product-sum;
        System.out.println("The subtraction of product and sum of digits of an integer is: "+result);

    }
}

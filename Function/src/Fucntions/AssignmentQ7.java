package Fucntions;
import java.util.Scanner;
public class AssignmentQ7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter a number to check if its prime or not");
        int n=in.nextInt();
        boolean ans= is_prime(n);
        System.out.println("It is "+ans+" that the number is prime");
    }
    static boolean is_prime(int n){

        if(n<=1){
            System.out.println("The number is not prime");

        }
        int c=2;
        while(c*c<n){
            if(n%c==0){
             return false;
            }
            c++;
        }
        if (c * c > n) return true;
        else return false;
    }
}

package Fucntions;
import java.util.Scanner;
public class AssignmentQ4 {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=input.nextInt();
        System.out.println("Enter 2nd number");
        int n2=input.nextInt();
        int sum=n1+n2;
        System.out.println("The sum is "+sum);
    }
}

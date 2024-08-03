package Fucntions;

import java.util.Scanner;

public class AssignmentQ5 {
    public static void main(String[] args) {
        product();
    }
    static void product(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1=input.nextInt();
        System.out.println("Enter 2nd number");
        int n2=input.nextInt();
        int product=n1*n2;
        System.out.println("The Product is "+product);
    }
}


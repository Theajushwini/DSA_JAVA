import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
        sum1(12,34);
    }
    static void sum1(int n1,int n2){
        int sum=n1+n2;
        System.out.println(sum);
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int n1 = in.nextInt();
        System.out.println("Enter 2nd number");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("The sum is: " + sum);
    }
}

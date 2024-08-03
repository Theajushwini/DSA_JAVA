package Fucntions;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number to check if prime:");
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println("the answer is :" + ans);
    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}

    //Print all the three digit armstrong numbers




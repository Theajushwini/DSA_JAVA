package Fucntions;

public class AssignmentQ10 {
    public static void main(String[] args) {
        int n=673;
        palindrome(n);
    }
    static void palindrome(int n){
        int m=n;
        int rem=0;
        int num=0;
        while(n>0){
            rem=n%10;
            num=num*10+rem;
            n=n/10;
        }
        if(num==m){
            System.out.println("The number is palindrome");
        }
        else {
            System.out.println("The number is not palindrome");
        }
    }
}

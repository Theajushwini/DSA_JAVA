package Fucntions;

public class AssignmentQ9 {
    public static void main(String[] args) {
        int n=5;
        int ans=factorial(n);
        System.out.println("the factorial is :"+ans);
    }
    static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            int num=n;
            num *= factorial(n - 1);
            return num;
        }
    }
}

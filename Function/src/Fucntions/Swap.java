package Fucntions;

public class Swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swap(a,b);
        {
            int c=100;
            System.out.println(c);
        }
int c=190;
    }
    static void swap(int n,int m){
        int temp=n;
        n=m;
        m=temp;
        System.out.println("The number 'a' is: "+n);
        System.out.println("The number 'b' is: "+m);
    }
}

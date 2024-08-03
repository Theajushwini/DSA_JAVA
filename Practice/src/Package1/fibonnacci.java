package Package1;
import java.util.Scanner;
public class fibonnacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int i=2;

     while(i<n){
         int temp =a+b;
         a=b;
         b=temp;
         i++;
        }
        System.out.println(b);
    }
}

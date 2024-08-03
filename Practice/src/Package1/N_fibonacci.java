package Package1;
import java.util.Scanner;
public class N_fibonacci {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number of fibonnaci number you want :");
        int n=in.nextInt();
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        for(int i=2;i<n;i++){
            int temp=a+b;
            a=b;
            b=temp;
            System.out.print(temp);
        }

    }
}

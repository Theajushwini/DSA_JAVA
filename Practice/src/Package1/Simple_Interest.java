package Package1;
import java.util.Scanner;
public class Simple_Interest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Principal Amount");
        int P=in.nextInt();
        System.out.println("enter the time period");
        int T=in.nextInt();
        System.out.println("Enter the Interest rate");
        int R=in.nextInt();
        float Amount=P*T*R/100;
        System.out.println("The simple interest is: "+Amount);
    }
}


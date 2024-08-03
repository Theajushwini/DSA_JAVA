package Package1;
import java .util.Scanner;

public class Counting_Occurences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A number :");
        int N=in.nextInt();
        System.out.println("Enter the number for which you want to find the number of occurences:");
        int a=in.nextInt();
        int count=0;
        int rem=0;
        while(N>0){
            rem=N%10;
            N=N/10;
            if(rem==a){
                count++;
            }

        }
        System.out.println("therofre the number of occurences of "+a +" is "+count);
    }
}

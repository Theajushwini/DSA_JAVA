package Fucntions;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        armstrong();
        if_armstrong();
    }
    static void armstrong(){
        int i =100;
        int rem;
        while(i<1000){

            int num=0;
            int n=i;
            while(n>0){
                rem=n%10;
                num=num+rem*rem*rem;
                n=n/10;
            }
            if (i == num) {
                System.out.println(i+" is armstrong");
            }
          i++;
        }
    }
    static void if_armstrong(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to  check if armstrong:");
        int n=in.nextInt();
        int i=n;
        int rem;
        int num=0;
        while(n>0){
            rem=n%10;
            num=num+rem*rem*rem;
            n=n/10;
        }
        if(i==num){
            System.out.println("Yes armstrong number");
        }
        System.out.println("not armstrong");
    }

}


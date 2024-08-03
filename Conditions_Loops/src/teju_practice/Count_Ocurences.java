package teju_practice;
import java.util.Scanner;

public class Count_Ocurences {
    public static <String> void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the number you want to count the occurence for ");
        int x=in.nextInt();
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==x){
                count++;
            }
            n=n/10;

        }
        System.out.println("The number of occurences is "+count);
    }
}


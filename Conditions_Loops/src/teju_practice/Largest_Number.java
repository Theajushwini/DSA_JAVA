package teju_practice;
import java.util.Scanner;
public class Largest_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();


       /* if(a>max){
            max=a;

        }
        if (c > max) {
            max=c;

        }
        if(b>max){
            max=b;
        }
        System.out.println(max);
    }*/
        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}

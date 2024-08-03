package teju_practice;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
   int n=in.nextInt();
   int a=0;
   int b=1;
        System.out.print(a+ " ");
        System.out.print(b+ " ");

        for(int i=2;i<=n;i++){

          b=a+b;
          a=b-a;
            System.out.print(b+" ");

   }
}
}

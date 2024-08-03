import java.util.Scanner;
public class ZQ3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter n :");
        int x;

        int n=in.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                x=i*i-2;
                System.out.print(x+" ");
            }
            else{
                x=i*i-1;
                System.out.print(x+" ");
            }

        }
    }
}

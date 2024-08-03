import java.util.Scanner;
public class ZQ_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input=in.nextLine();

        String[] ans=input.split(" ");
        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i] +" ");
        }

    }
}


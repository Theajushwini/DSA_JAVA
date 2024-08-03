package teju;
import java.util.Scanner;
public class AssignmentQ10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a string");
        String str=in.next();
        Boolean ans=checkIfPangram(str);
        if(ans){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }


    }
    public static boolean checkIfPangram(String sentence) {
        char[] arr=sentence.toCharArray();

        int[] three=new int[26];
        int ans=0;
        for(char c:arr){
            if(c>='a'&&c<='z'){
                three[c-'a']=1;
            }
        }

        for(int i:three){
            if(i==0){
                return false;
            }
        }
        return true;

    }

}

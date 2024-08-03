import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ZQ2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter number of max trials:");
        int n=in.nextInt();
        String[] arr=new String[n];
        List<String> ans=new ArrayList<>();
        int i=0;
        System.out.println("start Wordakshari");
        while(i<arr.length){
            arr[i]=in.next();
            if(i>0){
                if(arr[i].charAt(0)==arr[i-1].charAt(arr[i-1].length()-1)){
                    if(!ans.contains(arr[i])){
                        ans.add(arr[i-1]);
                    }
                    ans.add(arr[i]);

                }
                else if(arr[i].equals("####")){
                    break;
                }
                else{
                    ans.add(arr[i]);
                    break;
                }

            }
            i++;
        }
        System.out.println(ans);





       }

}

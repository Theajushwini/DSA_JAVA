package teju;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class AssignmentQ11 {
    public static void main(String[] Args){
        Scanner in=new Scanner(System.in);
        List<List<String>> input=new ArrayList<>();
        for(int i=0;i<3;i++){
            input.add(new ArrayList<>());
        }
        System.out.println("Enter 9 list elements");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                input.get(i).add(in.next());
            }
        }
        System.out.println("Enter ruleKey");
        String ruleKey=in.next();
        System.out.println("Enter ruleValue");
        String ruleValue=in.next();
        int ans=countMatches(input,ruleKey,ruleValue);
        System.out.println(ans);


    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans=0;
        for(List<String> i:items) {

            String individual="";
            if (ruleKey.equals("type")){
                individual=i.get(0);
            }
            else if(ruleKey.equals("color")){
                individual=i.get(1);
            }
            else if(ruleKey.equals("name")){
                individual=i.get(2);
            }

            if(ruleValue.equals(individual)){
                ans++;
            }


        }
        return ans;

    }
}

package teju;
import java.util.Scanner;

public class AssignmentQ16 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter no of elements");
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int ans=findNumbers(nums);
        System.out.println(ans);
    }
    public static int findNumbers(int[] nums){
        int[] nd=new int[nums.length];
        int ans=0;
        for(int i=0;i<nd.length;i++){
           int count= (int) (Math.log10(nums[i])+1);
            nd[i]=count;
            if(nd[i]%2==0){
                ans++;
            }


        }
        return ans;
    }

}

package teju;
import java.util.Scanner;
import java.util.Arrays;
public class AssignmentQ8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number of array elements");
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int[] ans=smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count =0;
            for(int j=0;j<nums.length;j++){

                if (nums[i]>nums[j]){
                    count++;
                }

            }
            ans[i]=count;
        }
        return ans;

    }
}

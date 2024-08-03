package teju;

import java.util.Arrays;

public class AssignmentQ20 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        int[] ans=twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){

                int sum=nums[i]+nums[j];
                if(sum==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;

    }
}

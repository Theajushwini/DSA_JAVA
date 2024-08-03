package teju;

import java.util.Arrays;

public class AssignmentQ3 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        int[] ans=runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }
    static int[] runningSum(int[] nums) {
        int[] runningsum=new int[nums.length];
        runningsum[0]=nums[0];
        for(int i=1;i<nums.length;i++){

            runningsum[i]=runningsum[i-1]+nums[i];
        }
       return runningsum;
    }

}

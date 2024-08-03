package teju;

import java.util.Arrays;

public class AssignmentQ2 {
    public static void main(String[] args) {
        int[] nums={1,2,1};
        getConcatenation(nums);
    }
    static void getConcatenation(int[] nums){
        int[] ans=new int[nums.length*2];
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

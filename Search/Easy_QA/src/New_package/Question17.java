package New_package;

public class Question17 {
    public static void main(String[] args) {
        int[] nums={3,5};
        int ans=specialArray(nums);
        System.out.println(ans);
    }
    public static int specialArray(int[] nums){
        int i=0;
        int count=0;
        int ans=0;
        while(i<nums.length){
            if(nums[i]>0){
                count++;
            }
            i++;
        }
        for (int num : nums) {
            if (num != 0 && num >=count) {
                ans++;
            }

        }
        if(ans==count && ans!=0 ){
            return ans;
        }
        return -1;
    }
}

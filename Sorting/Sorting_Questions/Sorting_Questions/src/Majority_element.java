

public class Majority_element {
    public static void main(String[] args) {
        int[] arr={4,5,4};
        System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        for(int i=0;i<=nums.length-2;i++){
            for(int j=i+1;j>0;j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
        int start=0;
        int end=nums.length-1;
        int mid=start+(end-start)/2;
        return nums[mid];
    }


}



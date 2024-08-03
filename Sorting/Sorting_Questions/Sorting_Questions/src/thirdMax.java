public class thirdMax {
    public static void main(String[] args) {
        int[] arr={2,2,5};
        System.out.println(thirdMax(arr));
    }
    public static  int thirdMax(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int count=0;
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                count++;
            }
        }
        if(nums.length<3 && count<=0){
            return nums[nums.length-1];
        }
        else if(nums.length<=3 && count>0){
            return nums[nums.length-1-count];
        }
        else if(count==nums.length-1){
            int max=nums[0];
            for(int j=1;j<nums.length;j++){
                if(max>nums[j]){
                    max=nums[j];
                }
            }
            return max;

        }
        return nums[nums.length-3-count];
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

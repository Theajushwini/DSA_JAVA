public class findDuplicate {
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        int ans=findDuplicate(arr);

        System.out.println(ans);
    }
    public static int findDuplicate(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }
        int ans=0;
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans=nums[index];
            }
        }
        return ans;
    }
    public static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}

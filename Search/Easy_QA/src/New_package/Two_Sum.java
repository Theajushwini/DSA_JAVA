package New_package;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr={1,2,7,11,12,15};
        int target=23;
        System.out.println(Arrays.toString(twoSum(arr,target)));


    }
    public static int[] twoSum(int[] numbers,int target){
        int start=0;
        int end=numbers.length-1;

        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
               return new int[]{start,end};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};

    }
}

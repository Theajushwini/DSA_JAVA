package teju;
import java.util.Scanner;
import java.util.Arrays;

public class AssignmentQ9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The   number of elements in both the arrays:");
        int n=in.nextInt();
        System.out.println("enter nums arrays:");
        int[] nums=new int[n];
        for(int i:nums){
            i=in.nextInt();
        }
        System.out.println("enter index arrays:");
        int[] index=new int[n];
        for(int i:index){
            i=in.nextInt();
        }

        int[] target=createTargetArray(nums,index);
        System.out.println(Arrays.toString(target));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target=new int[nums.length];
        for(int i=0;i<target.length;i++){
            if(target[index[i]]!=0){
                for(int j=i;j>index[i];j--){
                    target[j]=target[j-1];
                }
            }
            target[index[i]]=nums[i];

        }
        return target;

    }
}

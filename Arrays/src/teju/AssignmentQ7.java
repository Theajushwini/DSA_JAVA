package teju;
import java.util.Scanner;
public class AssignmentQ7 {
    public static void main(String[] args) {
        Scanner  in=new Scanner(System.in);
        System.out.println("Enter the number of elements in array;");
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i:nums){
            i=in.nextInt();
        }
        int good_pairs=numIdenticalPairs(nums);
        System.out.println(good_pairs);
    }
    public static int numIdenticalPairs(int[] nums) {
        int pairs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    pairs++;
                }

            }

        }
        return pairs;

    }
}

package teju;
import java.util.Arrays;
import java.util.Scanner;
public class AssignmentQ5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements of your array");
        int m=in.nextInt();
        int[] nums=new int[m];
        for(int i=0;i<m;i++){
            nums[i]=in.nextInt();
        }
        int n=m/2;
        int[] ans=shuffle(nums,n);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=0;

        while(j<n){
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
            j++;
            i=i+2;
        }
       return ans;
    }
}


package New_package;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Question13 {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] ans=intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] intersection(int[] nums1,int[] nums2){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){

                if(nums1[i]==nums2[j]&& list.contains(nums1[i])==false){
                    list.add(nums1[i]);
                }

            }
        }
        int[] ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }

        return ans;

    }
}

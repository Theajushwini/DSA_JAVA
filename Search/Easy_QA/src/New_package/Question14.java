package New_package;

import java.util.ArrayList;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {

    }
    public static int[]intersection(int[] nums1,int[] nums2){
        List<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){

                if(nums1[i]==nums2[j]){
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

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Intersection_Of_Two_Arrays {
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] ans=intersect(nums1,nums2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] intersect(int[] nums1, int[] nums2){
      sort(nums1);
      sort(nums2);
      List<Integer> ans=new ArrayList<>(1);
      int i=0;
      int j=0;
      while(i<nums1.length&& j<nums2.length){
          if(nums1[i]>nums2[j]){
              j++;
          }else if(nums1[i]<nums2[j]){
              i++;
          }
          else{
              ans.add(nums1[i]);
              i++;
              j++;
          }
      }
      int[] array=new int[ans.size()];
      for(int index=0;index<array.length;index++){
          array[index]=ans.get(index);

        }
      return array;
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

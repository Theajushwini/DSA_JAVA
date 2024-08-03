package New_package;
import java.util.List;
import java.util.ArrayList;

public class Question8 {
    public static void main(String[] args) {
        int[] arr={2,3,4,7,11};
        int k=5;
        System.out.println(findKthPositive(arr,k));

    }
    public static int findKthPositive(int[] arr,int k){
        List<Integer> list=new ArrayList<Integer>() ;
        int i=0;
        int j=1;
        while(list.size()<k){
            if(i<arr.length &&arr[i]==j){
                i++;
            }else{
                list.add(j);
            }
            j++;
        }
        if(list.size()<k){
            return (k-list.size())+arr[arr.length-1];
        }
        return list.get(k-1);
    }
}

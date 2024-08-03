import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] arr={6,4,3,32,11,-13,-1};
        System.out.println(Arrays.toString(bubble(arr)));
    }
    public static int[] bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-i-1;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}

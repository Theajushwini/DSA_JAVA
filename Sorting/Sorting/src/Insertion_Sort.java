import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,2,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
        for(int i=0;i<=arr.length-2;i++){
            //we run the first loop till n-2 since have it run till n-1 will lead to index out of bound error which can be seen in the next loop
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }

    }
}

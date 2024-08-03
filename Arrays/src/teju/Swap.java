package teju;

public class Swap {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        System.out.println("THe array before swapping:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        swap(a,1,3);
    }
    static void swap(int[] arr,int id1,int id2){
        int temp=arr[id2];
        arr[id2]=arr[id1];
        arr[id1]=temp;
        System.out.println("The array with swapped values is: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

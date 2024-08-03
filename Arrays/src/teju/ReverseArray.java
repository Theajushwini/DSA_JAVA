package teju;

public class ReverseArray  {
    public static void main(String[] args) {
        int[] arr={11,221,4,3,2,1};
        Reverse(arr);
    }
    static void Reverse(int[] a){
        int start=0;
        int end=a.length-1;
        while(start<end){
            int temp=a[end];
            a[end]=a[start];
            a[start]=temp;
            end--;
            start++;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}

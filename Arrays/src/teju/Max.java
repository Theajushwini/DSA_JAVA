package teju;

public class Max {
    public static void main(String[] args) {
        int[] arr={1,34,55,11,8};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;

    }
}

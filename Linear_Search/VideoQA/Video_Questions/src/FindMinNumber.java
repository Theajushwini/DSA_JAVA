public class FindMinNumber {
    public static void main(String[] args) {
        int[] arr={11,-3,2,5,6,33,-98};
        System.out.println(min(arr));
    }
    public static int min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;

    }
}

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr={19,-4,3,12,6,2,19,23,90};
        int target=12;
        int ans=LinearSearch(arr,target);
        System.out.println(ans);
    }
    public static int LinearSearch(int[]  arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int index=0;index<arr.length;index++){
            if(target==arr[index]){
                return index;
            }
        }
        return -1;
    }
}

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={11,-3,2,5,6,33,-98};
        int target=34;
        int start=2;
        int end=6;
        System.out.println(Searchinrange(arr,target,start,end));
    }
    public static Boolean Searchinrange(int[] arr,int target,int start,int end){
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;

    }
}

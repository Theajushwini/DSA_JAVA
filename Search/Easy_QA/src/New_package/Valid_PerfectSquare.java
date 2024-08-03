package New_package;

public class Valid_PerfectSquare {
    public static void main(String[] args) {
        int num=16;
        System.out.println(isPerfectSquare(num));
    }
    public static boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid==num){
                return true;
            }
            else if((long)mid*mid>num){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return false;

    }
}

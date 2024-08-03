package New_package;

public class Square_Root {
    public static void main(String[] args) {
        int x=7;
        System.out.println(mySqrt(x));
    }
    public static  int mySqrt(int x){
        int start =1;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid==(long)x){
                return mid;
            }
            else if(mid*mid>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return end;
    }
}

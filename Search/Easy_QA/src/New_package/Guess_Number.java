package New_package;

public class Guess_Number {
    public static void main(String[] args) {
        int n=30;

        System.out.println(guessNumber(n));
    }
    static int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            int result=guess(mid);
            if(result==-1){
                end=mid-1;
            }else if(result==1){
                start=mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
    static int guess(int num){
        int pick =34;
        if(num>pick){
            return -1;
        }
        else if(num<pick){
            return 1;
        }
        else{
            return 0;
        }
    }
}

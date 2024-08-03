package New_package;
import java.util.Scanner;
public class Question1 {
    public static void main(String[] args) {
        System.out.println("enter an integer");
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        System.out.println("The rounded of  answer to the square r0ot of the number is :"+mySqrt(x));
    }
    public static int mySqrt(int x){
        int start=0;
        int end=x;
        while(start<=end){
            int mid=start+(end-start)/2;
            if((long)mid*mid==x){
                return mid;
            }
            else if((long)mid*mid>x){
                end=mid-1;
            }
            else{
                start=mid+1;
            }


        }
        return end;


    }
}

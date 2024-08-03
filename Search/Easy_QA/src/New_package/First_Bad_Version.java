package New_package;
import java.util.Scanner;

public class First_Bad_Version {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of versions");
        int n=in.nextInt();
        System.out.println(firstBadVersion(n));
    }
    public static int firstBadVersion(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            boolean ans=isBadVersion(mid);
            if(ans){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;

    }

    static Boolean isBadVersion(int version){
        int bad=6;
        if(version>=bad){
            return true;
        }
        else {
            return false;
        }

    }

}

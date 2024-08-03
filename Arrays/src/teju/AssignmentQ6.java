package teju;
import java.util.ArrayList;
import java.util.Scanner;
public class AssignmentQ6 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter extra candies:");
        int candy=in.nextInt();
        System.out.println("Enter your number of elements in array");
        int n=in.nextInt();
        System.out.println("Enter your input array");
        int[] candies = new int[n];
        for(int i=0;i<n;i++) {
            candies[i]=in.nextInt();
        }
        ArrayList<Boolean> list1=kidsWithCandies(candies,candy);
        System.out.println(list1);
    }
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list=new ArrayList<>();
        int max=candies[0];
        for(int j=0;j<candies.length;j++){
            if(candies[j]>max){
                max=candies[j];
            }

        }
        for(int i=0;i<candies.length;i++){
            candies[i]=candies[i]+extraCandies;
            if(candies[i]>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;

    }
}


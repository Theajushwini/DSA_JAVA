package Fucntions;
import java.util.Scanner;
public class AssignmentQ1 {
    public static void main(String[] args) {
        Greatest();
    }
    static void Greatest(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int one=in.nextInt();
        System.out.println("Enter 2nd Number");
        int two=in.nextInt();
        System.out.println("Enter 3rd Number");
        int three=in.nextInt();
        int max=one;
        if(max<two){
            max=two;
        }
        if(max<three){
            max=three;
        }
        System.out.println("Therefore out of the three numbers :"+one+" "+two+" "+three+"the greater one is : "+max);

    }
}

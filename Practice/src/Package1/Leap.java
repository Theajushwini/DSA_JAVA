package Package1;
import java.util.Scanner;
public class Leap{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a year");
        int yr =in.nextInt();
        if((yr % 100 != 0 & yr % 4 == 0)| (yr %400==0)){
            System.out.println("Yes Leap Year");
        }
        else{
            System.out.println("Not A Leap Year");
        }
    }
}


package Fucntions;
import java.util.Scanner;
public class AssignmentQ6 {
    public static void main(String[] args) {
        circle();
    }
    static void circle(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the radius of the Circle:");
        int r=in.nextInt();
        double area=3.14*r*r;
        System.out.println("The area of the circle is :"+area);
        double circumference=2*3.14*r;
        System.out.println("The circumference of the circle is :"+circumference);
    }
}

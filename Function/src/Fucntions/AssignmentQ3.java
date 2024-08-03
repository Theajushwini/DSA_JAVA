package Fucntions;
import java.util.Scanner;
public class AssignmentQ3 {
    public static void main(String[] args) {
        vote_eligibility();
    }
     static void vote_eligibility(){
        Scanner in=new Scanner(System.in);
         System.out.println("Dear Citizen ,Please Enter Your Name:");
         String name=in.next();
         System.out.println("Please Enter Your Age :");
         int age=in.nextInt();
         if(age>18){
             System.out.println("Congratulations "+name+" you are eligible to vote.");
         }
         else{
             System.out.println("Sorry "+name+" you are not eligible to vote");
         }
     }
}

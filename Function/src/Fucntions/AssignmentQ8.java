package Fucntions;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AssignmentQ8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=in.nextLine();
        System.out.println("Enter your marks:");
        int marks=in.nextInt();
        grade(marks,name);
    }
    static void grade(int marks,String name){
       if(marks>90&& marks<=100) {
           System.out.println(name + " Your grade is AA");
       }
        else if (marks>80 && marks<=90){
           System.out.println(name +" Your grade is AB");
        }
       else if (marks>70 && marks<=80){
           System.out.println(name +" Your grade is BB");
       }
       else if (marks>60 && marks<=70){
           System.out.println(name +" Your grade is BC");
       }
       else if (marks>50 && marks<=60){
           System.out.println(name +" Your grade is CD");
       }
       else if (marks>40 && marks<=50){
           System.out.println(name +" Your grade is DD");
       }
       else{
           System.out.println(name+ "Sorry you have failed");
       }
    }
}

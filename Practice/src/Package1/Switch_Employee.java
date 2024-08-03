package Package1;
import java.util.Scanner;
public class Switch_Employee {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter employee id:");
        int id=in.nextInt();
        switch(id){
            case 1:
                System.out.println("Welcome Anil");
                break;
            case 2:
                System.out.println("Welcome Pushpak");
                break;
            default:
                System.out.println("Enter name:");
                String name=in.next();
                System.out.println("Welcome :"+name);
        };
    }
}

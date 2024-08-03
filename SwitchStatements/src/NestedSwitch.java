package src;


import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int empID=in.nextInt();
        String department=in.next();
        switch (empID) {
            case 1 -> System.out.println("Kunal Kushwaha");
            case 2 -> System.out.println("Hello");
            case 3 -> {
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Dept");
                    default -> System.out.println("No dept");
                }
            }
            default -> System.out.println("No employee ID Entered");
        }
    }
}
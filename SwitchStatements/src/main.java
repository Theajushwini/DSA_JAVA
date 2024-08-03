package src;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Enter a number for the day of the week it will be :");
        Scanner in = new Scanner(System.in);

       /* switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red Fruit");
            case "Banana" -> System.out.println("A yellow fruit");
            case "Grapes" -> System.out.println("Smallest Fruit");
            default -> System.out.println("Please enter a valid input!");*/
        int day=in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("WEEKDAY");
            case 6, 7 -> System.out.println("WEEKEND");
        }

        }
    }



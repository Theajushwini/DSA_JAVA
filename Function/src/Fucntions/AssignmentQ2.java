package Fucntions;

public class AssignmentQ2 {
    public static void main(String[] args) {
        int n=9898;
        Odd_or_Even(n);
    }
    static void Odd_or_Even(int n){
        if (n%2==0){
            System.out.println("The number "+n+" is Even");
        }
        else{
            System.out.println("The number is Odd");
        }
    }
}

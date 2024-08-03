package Package1;
import java.util.Scanner;
public class Area_with_Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter any number form 1 to 4 to find area");
        System.out.println("1-Circle,2-Square,3-Rectangle,4-Triangle");
        int n=input.nextInt();
        double area;
        if(n==1){
            System.out.println("Enter radius:");
            int r=input.nextInt();
            area=3.14*r*r;
            System.out.println("the area is: "+area);
        }
        else if(n==2){
            System.out.println("Enter side:");
            int a=input.nextInt();
            area=a*a;
            System.out.println("the area is: "+area);
        }
        else if(n==3){
            System.out.println("Enter length:");
            int l=input.nextInt();
            System.out.println("Enter breadth:");
            int b=input.nextInt();
            area=l*b;
            System.out.println("the area is: "+area);
        }
        else if(n==4){
            System.out.println("Enter height:");
            int h=input.nextInt();
            System.out.println("Enter breadth:");
            int b=input.nextInt();
            area=0.5*b*h;
            System.out.println("the area is: "+area);
        }

    }
}

package Package1;
import java.util.Scanner;
public class List_Sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of inputs for your List:");
        int n=in.nextInt();
        int sum_negative=0;
        int sum_pos_even=0;
        int sum_pos_odd=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter an integer:");
            int num=in.nextInt();
            if(num<0){
                sum_negative=sum_negative+num;
            }
            else if(num>0){
                if(num%2==0){
                    sum_pos_even=sum_pos_even+num;
                }
                else{
                    sum_pos_odd=sum_pos_odd+num;
                }
            }
            else if(num==0){
                break;
            }
        }
        System.out.println("The sum of negative numbers:"+sum_negative);
        System.out.println("The sum of positive even numbers:"+sum_pos_even);
        System.out.println("The sum of positive odd numbers:"+sum_pos_odd);
    }

}

package teju;
import java.util.Arrays;
import java.util.Scanner;
public class

input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[5];
       /* for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();

        }
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println(Arrays.toString(arr));*/
        String[] arr1=new String[5];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=in.next();
        }
        System.out.println(Arrays.toString(arr1));
        arr1[2]="Teju";
        System.out.println(Arrays.toString(arr1));
    }
}

package teju;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class PassinginFunction {
    public static void main(String[] args) {
        int[] nums={1,2,5,3,4};
        System.out.println(Arrays.toString(nums));
        change(nums);
    }
    static void change(int[] arr){
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        System.out.println(Arrays.toString(arr));

    }
}

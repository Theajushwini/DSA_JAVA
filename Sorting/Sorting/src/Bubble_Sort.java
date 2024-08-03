import java.util.Arrays;

public class Bubble_Sort {



        public static void main(String[] args) {
            int[] arr = {3,1,5,4,2};
            Bubble(arr);
            System.out.println(Arrays.toString(arr));
        }

        static void Bubble(int[] arr) {
            boolean swapped;

            //run the loop for n-1 times
            for (int i = 0; i < arr.length; i++) {
                swapped = false;
                //for each step,max item will come at the last respective index(same as step)
                for (int j = 1; j <= arr.length - 1 - i; j++) {
                    if (arr[j] < arr[j - 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j - 1];
                        arr[j - 1] = temp;
                        swapped = true;
                    }
                }
                //if you did not swap for a particular value of i means the array is sorted so break out of the loop
                if(!swapped){
                    break;
                }

            }
        }

}

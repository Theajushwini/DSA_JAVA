package New_package;

import java.util.concurrent.ScheduledExecutorService;

public class Question16 {
    public static void main(String[] args) {
        int[] arr={10,2,5,3};
        boolean ans=checkIfExist(arr);
        System.out.println(ans);
    }
    public static boolean checkIfExist(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]*2 && (i!=j)){
                    return true;
                }
            }
        }
        return false;
    }
}

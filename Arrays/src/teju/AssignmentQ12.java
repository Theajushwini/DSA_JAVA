package teju;
import java.util.Scanner;

public class AssignmentQ12 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("The number of gains");
        int n=in.nextInt();
        int[] gain=new int[n];
        for(int i=0;i<n;i++){
            gain[i]=in.nextInt();
        }
        int maxaltitude=largestAltitude(gain);
        System.out.println(maxaltitude);

    }
    public static int largestAltitude(int[] gain){
        int[] Altitudes=new int[gain.length+1];
        Altitudes[0]=0;
        for(int i=1;i<Altitudes.length;i++){
            Altitudes[i]=gain[i-1]+Altitudes[i-1];
        }
        int max=Altitudes[0];
        for(int i=1;i<Altitudes.length;i++){
            if(max<Altitudes[i]){
                max=Altitudes[i];
            }
        }
        return max;
    }
}

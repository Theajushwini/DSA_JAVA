package teju;

import java.util.Arrays;
import java.util.Scanner;

public class AssingmentQ13 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the dimensions");
        int n=in.nextInt();
        System.out.println("enter array elements");
        int[][] image=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j]=in.nextInt();
            }
        }
        int[][] ans=flipAndInvertImage(image);
        System.out.println(Arrays.toString(ans));


    }
    public static int[][] flipAndInvertImage(int[][] image){
        int n=image[0].length-1;

        for(int[] sam:image) {
            for (int i = 0; i <=n/2; i++) {
                int temp = sam[i];
                sam[i] = sam[n - i];
                sam[n - i] = temp;
            }
        }
        int[][] output=new int[image.length][image.length];

        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){

                if(image[i][j]==0){
                    output[i][j]=1;
                }
                else{
                    output[i][j]=0;
                }
            }
        }


        return output;

    }



}

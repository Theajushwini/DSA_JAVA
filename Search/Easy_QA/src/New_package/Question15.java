package New_package;

import java.util.Arrays;

public class Question15 {
    public static void main(String[] args) {
        int[] aliceSizes={1,1};
        int[] bobSizes={2,2};
        int[] ans=fairCandySwap(aliceSizes,bobSizes);
        System.out.println(Arrays.toString(ans));
    }
    public static int[]fairCandySwap(int[] aliceSizes,int [] bobSizes){
        int[] ans=new int[2];
        int max1=aliceSizes[0];
        int min1=aliceSizes[0];
        int tsum1=aliceSizes[0];
        for(int i=1;i<aliceSizes.length;i++){
            if(aliceSizes[i]>max1){
                max1=aliceSizes[i];
            }
            if(aliceSizes[i]>min1){
                min1=aliceSizes[i];
            }
            tsum1=tsum1+aliceSizes[i];

        }
        int max2=bobSizes[0];
        int min2=bobSizes[0];
        int tsum2=bobSizes[0];
        for(int i=1;i<bobSizes.length;i++){
            if(bobSizes[i]>max2){
                max2=bobSizes[i];
            }
            if(bobSizes[i]>min2){
                min2=bobSizes[i];
            }
            tsum2=tsum2+bobSizes[i];

        }
        if(tsum1>tsum2){
            ans[0]=max1;
            ans[1]=min2;
        }
        else{
            ans[0]=min1;
            ans[1]=max2;
        }
        return ans;

    }

}

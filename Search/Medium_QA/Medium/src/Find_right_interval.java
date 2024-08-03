import java.util.Arrays;

public class Find_right_interval {
    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{0,1},{3,4}};
        int[] ans=findRightInterval(intervals);
        System.out.println(Arrays.toString(ans));


    }
    public static int[] findRightInterval(int[][] intervals){
        int[] ans=new int[intervals.length];
        if(intervals.length==1){
            ans[0]=-1;
            return ans;
        }
        for(int i=0;i<intervals.length;i++){
            int answer=0;
            int count=-1;
            for(int j=0;j<intervals.length;j++){
                if(intervals[i][1]<=intervals[j][0]){
                    answer=j;
                    count++;
                }


            }
            ans[i]=answer;
            if(count<0){
                ans[i]=count;
            }

        }
        return ans;

    }

}

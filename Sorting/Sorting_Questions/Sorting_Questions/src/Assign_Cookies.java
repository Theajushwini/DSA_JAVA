public class Assign_Cookies {
    public static void main(String[] args) {
      int[] g={10,9,8,7,10,9,8,7};
      int[] s={10,9,8,7};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g,int[] s){
        int count=0;
        sort(g);
        sort(s);
        int i=0;
        int j=0;
        while((i<g.length) && (j<s.length)){
            if(g[i]<=s[j]){
                count++;
                i++;
                if(j<g.length-1) {
                    j++;
                }
            }
            else if(g[i]>s[j]){
                if(j!=s.length-1){
                    j++;
                }
                else if(j==s.length-1){
                    j=0;
                    i++;
                }
            }

        }
        return count;
    }
    public static void sort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
}

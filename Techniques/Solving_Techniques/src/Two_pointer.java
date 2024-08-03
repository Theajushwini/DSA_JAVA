public class Two_pointer {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int sum=13;
        int i=0;
        int j=arr.length-1;
        int flag=0;
        while(i<j) {
            if (arr[i] + arr[j] == sum) {
                flag = 1;
                break;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            }else{
                j--;
            }
        }

        if(flag==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

package New_package;

public class Question2 {
    public static void main(String[] args) {
        int n=12;
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n){
        int i=0;
        while(n>0&&n>i){
            i++;
            n=n-i;

        }
        return i;
    }
}

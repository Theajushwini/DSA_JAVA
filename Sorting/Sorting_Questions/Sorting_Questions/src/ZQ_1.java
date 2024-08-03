
public class ZQ_1 {
    public static void main(String[] args) {
        int x=297;
        int number=x;
        int count1=count(x);

        int square=number*number;
        int divisor = (int) Math.pow(10, count1);

        int first = square / divisor;
        int second = square % divisor;
        System.out.println(first);


    }
    static int count(int x){
        int count=0;
        while(x>0){
            x=x/10;
            count++;
        }
        return count;
    }
}

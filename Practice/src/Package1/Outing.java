package Package1;

public class Outing {
    public static void main(String[] args) {
        int n=31;
        int count=0;
        for(int i=1;i<=31;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("The number of days he can go out is:"+ count);
    }
}

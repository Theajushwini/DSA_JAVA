package Fucntions;

public class Reverse {
    public static void main(String[] args) {
        reverse();
    }
    static void reverse(){
        int i=100;
        while(i<1000){
            int n=i;

            int rnum=0;
            int rem=0;
            while(n>0) {
                rem = n % 10;

                rnum = rnum * 10 + rem;
                n=n/ 10;
            }
            if(rnum==i){
                System.out.println(i+" is Palindrome number");
            }

            i++;
        }
    }
}


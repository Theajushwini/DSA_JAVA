package Fucntions;

public class AssignmentQ13 {
    public static void main(String[] args) {
        int n=19;
        int m=100;
        is_prime(n,m);
    }
    static void is_prime(int n,int m){

        for(int i=n;i<m;i++) {
             int ans=1;

            if (i <= 1) {
                ans = 0;
            }
            else {
                int c = 2;
                while (c * c <= i) {
                    if (i % c == 0) {
                        ans = 0;
                    }
                    c++;
                }

            }
            if (ans == 1) {
                System.out.println(i);
            }
        }
    }
}

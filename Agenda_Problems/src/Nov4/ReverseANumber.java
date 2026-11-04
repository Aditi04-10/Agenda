package Nov4;

import java.util.Scanner;

public class ReverseANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int rev = 0;
        int copy = N;
        int d = 0;

        if(N<0){
            N = N*(-1);
        }
        while(N>0){
            d=N%10;
            rev = rev*10+d;
            N = N/10;
        }

        if(copy<0){
            rev = rev*(-1);
        }
        System.out.print(rev);
    }
}

package Nov4;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T>0){
            int N = sc.nextInt();
            int copy = N;
            int rev = 0;
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

            if(copy==rev){
                System.out.println("Palindromic");
            }
            else{
                System.out.println("Not Palindromic");
            }
            T--;
        }
    }
}

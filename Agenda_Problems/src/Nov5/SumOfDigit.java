package Nov5;

import java.util.Scanner;

public class SumOfDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int sum=0;
            while(N>0){
                int lastDigit = N % 10;
                sum = sum+lastDigit;
                N=N/10;
            }
            System.out.println(sum);
            T--;
        }
    }
}

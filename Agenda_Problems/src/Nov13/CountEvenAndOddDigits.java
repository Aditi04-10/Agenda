package Nov13;

import java.util.Scanner;

public class CountEvenAndOddDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int EvenCount = 0;
            int OddCount = 0;
            int rem;

            while (n > 0) {
                rem = n % 10;
                if (rem % 2 == 0) {
                    EvenCount++;
                } else {
                    OddCount++;
                }
                n = n / 10;
            }
            System.out.println(EvenCount);
            System.out.println(OddCount);
        }
        t--;
    }
}

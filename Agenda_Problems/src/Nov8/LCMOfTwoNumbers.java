package Nov8;

import java.util.Scanner;

public class LCMOfTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int lcm;
        int gcd = 1;
        for (int i = 2; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        lcm = (n1*n2)/gcd;
        System.out.println(lcm);
    }
}

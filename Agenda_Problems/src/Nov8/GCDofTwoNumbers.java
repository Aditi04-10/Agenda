package Nov8;

import java.util.Scanner;

public class GCDofTwoNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int largest = 1;
        for (int i = 2; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                largest = i;
            }
        }
        System.out.println(largest);
    }
}

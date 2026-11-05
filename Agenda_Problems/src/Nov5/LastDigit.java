package Nov5;

import java.util.Scanner;

public class LastDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int lastDigit = N % 10;
            System.out.println(lastDigit);
            T--;
        }
    }
}

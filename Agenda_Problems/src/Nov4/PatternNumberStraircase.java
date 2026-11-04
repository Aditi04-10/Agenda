package Nov4;

import java.util.Scanner;

public class PatternNumberStraircase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int r=1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(r++);
            }
            System.out.println();
        }
    }
}

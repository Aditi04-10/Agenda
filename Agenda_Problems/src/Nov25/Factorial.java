package Nov25;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println(fact);
    }
}

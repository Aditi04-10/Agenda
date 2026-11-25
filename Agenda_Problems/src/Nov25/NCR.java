package Nov25;

import java.util.Scanner;

public class NCR {
    static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(factorial(n)/(factorial(r)*factorial(n-r)));


    }
}

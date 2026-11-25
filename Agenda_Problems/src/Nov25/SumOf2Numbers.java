package Nov25;

import java.util.Scanner;

public class SumOf2Numbers {
    static int Sum(int a, int b){
        int c = a+b;
        return c;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Sum(a,b));
    }
}

package Nov25;

import java.util.Scanner;

public class SumOf3Numbers {
    static int Sum(int a, int b, int c){
        int sum = a+b+c;
        return sum;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Sum(a,b,c));
    }
}

package Nov27;

import java.util.Scanner;

public class MaxOf2NumbersFunction {
    static int Max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Max: " + Max(a,b));
    }
}

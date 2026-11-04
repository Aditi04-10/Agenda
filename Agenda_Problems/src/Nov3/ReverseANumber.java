package Nov3;

import java.util.Scanner;

public class ReverseANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ReverseNum(n));
    }

    public static int ReverseNum(int n){
        int lastDigit;
        int rem=0;
        while(n>0){
            lastDigit =n%10;
            rem = rem *10+lastDigit ;
            n=n/10;

        }
        return rem;
    }
}

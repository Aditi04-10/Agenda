package Nov3;

import java.util.Scanner;

public class CountOddDDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountOddDigits(n));
    }

    public static int CountOddDigits(int n){
        int count=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            if(rem%2!=0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}

package Nov3;

import java.util.Scanner;

public class SmallestDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(smallestDigit(n));
    }

    public static int smallestDigit(int n){
        int smallest=9;
        int rem=0;
        while(n>0){
            rem=n%10;
            if(rem<smallest){
                smallest = rem;
                n=n/10;
            }
            else{
                n=n/10;
            }
        }
        return smallest;
    }
}

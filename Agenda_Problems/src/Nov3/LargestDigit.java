package Nov3;

import java.util.Scanner;

public class LargestDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(largestDigit(n));
    }

    public static int largestDigit(int n){
        int largest=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            if(rem>largest){
                largest = rem;
                n=n/10;
            }
            else{
                n=n/10;
            }
        }
        return largest;
    }
}

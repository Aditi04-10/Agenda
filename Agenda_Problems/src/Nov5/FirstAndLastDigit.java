package Nov5;

import java.util.Scanner;

public class FirstAndLastDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int lastDigit;
            int firstDigit;
            lastDigit=N%10;
            firstDigit = N;

            while (firstDigit >= 10) {
                firstDigit = firstDigit / 10;
            }
            System.out.println(firstDigit + " " + lastDigit);
            T--;
        }
    }
}

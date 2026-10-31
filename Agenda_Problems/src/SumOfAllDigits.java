import java.util.Scanner;

public class SumOfAllDigits {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountDigit(n));
    }

    public static int CountDigit(int n){
        int sum=0;
        if(n==0){
            return sum;
        }
        while(n>0){
            int Digit;
            Digit =n%10;
            sum= sum+Digit;
            n=n/10;

        }
        return sum;
    }
}


import java.util.Scanner;

public class CountEvenDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountEvenDigits(n));
    }

    public static int CountEvenDigits(int n){
        int count=0;
        int rem=0;
        while(n>0){
            rem=n%10;
            if(rem%2==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }
}

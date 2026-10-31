import java.util.Scanner;

public class CountAllDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(CountDigit(n));
    }

    public static int CountDigit(int n){
        int count=0;
        if(n==0){
            return 1;
        }
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
}

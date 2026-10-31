import java.util.Scanner;

public class ProductOfAllDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(ProductDigit(n));
    }

    public static int ProductDigit(int n){
        int product=1;
        if(n==0){
            return 0;
        }
        while(n>0){
            int Digit;
            Digit =n%10;
            product= product*Digit;
            n=n/10;

        }
        return product;
    }
}

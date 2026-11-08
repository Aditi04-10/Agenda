package Nov8;

import java.util.Scanner;

public class PrimeNumbersUptoN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count = 0;
        for(int i=2;i<=n;i++){
            int f = 0;
            for(int j=1;j<=i;j++)
                if(i%j==0){
                    f++;
                }
            if (f == 2) {   //beacuse there is only two factors of a prime number
                count++;
            }

        }
        System.out.println(count);
    }
}

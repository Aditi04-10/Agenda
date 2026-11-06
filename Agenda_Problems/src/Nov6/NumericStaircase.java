package Nov6;

import java.util.Scanner;

public class NumericStaircase {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}

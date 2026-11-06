package Nov6;

import java.util.Scanner;

public class PatternSpaces {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("*");
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }

    }
}

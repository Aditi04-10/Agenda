package Nov4;

import java.util.Scanner;

public class RectangleMatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

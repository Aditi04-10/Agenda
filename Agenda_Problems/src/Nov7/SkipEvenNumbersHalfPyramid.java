package Nov7;

import java.util.Scanner;

public class SkipEvenNumbersHalfPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}

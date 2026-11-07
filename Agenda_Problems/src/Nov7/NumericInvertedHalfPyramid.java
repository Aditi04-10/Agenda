package Nov7;

import java.util.Scanner;

public class NumericInvertedHalfPyramid {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i+1;j++){
                if(j==N-i+1){
                    System.out.print(j);
                }
                else{
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
    }
}

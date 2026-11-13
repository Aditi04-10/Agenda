package Nov13;

import java.util.Scanner;

public class ArmstrongNumberUptoN {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            int sum=0;
            int num=i;
            while(num>0){
                int d = num%10;
                sum = sum+d*d*d;
                num=num/10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}

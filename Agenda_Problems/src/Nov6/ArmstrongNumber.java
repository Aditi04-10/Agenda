package Nov6;

import java.util.Scanner;

public class ArmstrongNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int rem;
            int sum=0;
            int num=i;
            while(num>0) {
                rem = num % 10;
                sum = sum + (rem * rem * rem);
                num = num / 10;
            }
                if (sum == i) {
                    System.out.println(i);
                }
            }
        }
    }

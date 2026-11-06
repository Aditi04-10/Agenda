package Nov6;

import java.util.Scanner;

public class PatternCharacter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(char i=1;i<=n;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

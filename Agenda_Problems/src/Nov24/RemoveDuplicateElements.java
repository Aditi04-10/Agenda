package Nov24;

import java.util.Scanner;

public class RemoveDuplicateElements {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int k = 1;
        int prev = 1;
        for(int i=1; i<n; i++){
            if(nums[i] != prev){
                nums[k] = nums[i];
                prev = nums[i];
                k++;
            }

        }
        System.out.println("Unique Elements:" + k);
        for(int i=0; i<k; i++){
            System.out.println(nums[i]);
        }
    }
}

package Nov8;

import java.util.Scanner;

public class ArraySortedOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ArraySortedOrNot obj = new ArraySortedOrNot();
        System.out.println(obj.fucn(n,arr));
    }

    public boolean fucn(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
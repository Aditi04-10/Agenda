package Nov8;

import java.util.Scanner;

public class ReverseArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ReverseArray obj = new ReverseArray();
        obj.reverse(arr,n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void reverse(int[] arr, int n) {
        int[] A= new int[n];
        for(int i=0;i<n;i++){
            A[n-i-1]=arr[i];
        }
        for(int i = 0;i<n;i++){
            arr[i] = A[i];
        }
    }
}

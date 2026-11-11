package Nov11;

import Nov8.ArraySortedOrNot;

import java.util.HashMap;
import java.util.Scanner;

public class HighestOccuringElementByHashing {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        HighestOccuringElementByHashing obj = new HighestOccuringElementByHashing();
        System.out.println(obj.func(nums));
    }

    public int func(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }

        int max = 0;
        int ans = 0;
        int freq;
        for(int i=0; i<nums.length; i++){
            freq = map.get(nums[i]);
            if(freq>max){
                max = freq;
                ans = nums[i];
            }
            else if(max == freq && nums[i] < ans){
                ans = nums[i];
            }
        }
        return ans;
    }
}

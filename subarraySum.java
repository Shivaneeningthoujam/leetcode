package leetcode;

import java.util.*;

public class subarraySum {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, -10 };
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();// stores the sum frequency
        map.put(0, 1);// empty subarray
        int ans = 0;
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum - k)) {
                // The program checks if map contains the key sum - k. This is to check if there
                // exists a
                // previous cumulative sum such that the difference between the current
                // cumulative sum and
                // that previous sum is k.
                ans += map.get(sum - k);
                // If such a key exists, it means there is a subarray ending at the current
                // index j
                // that sums to k. The count of such subarrays is added to ans.
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
                // This updates the frequency of sum
            } else {
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
package leetcode;

import java.util.*;

// Given an array of integers representing the lengths of ropes, the task is to connect the ropes into one rope. 
// The cost to connect two ropes is equal to the sum of their lengths. 
// The goal is to connect all the ropes with the minimum cost.
//We are given N ropes of different ropes.We have to connect all the ropes where longest rope is in first section
public class minCost {
    static long cost(long arr[], int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(arr[i]);
        }
        long cost = 0;
        while (pq.size() > 1) {
            long min = pq.remove();
            long min1 = pq.remove();
            cost = cost + min + min1;
            pq.add(min + min1);
        }
        return cost;
    }

    public static void main(String[] args) {
        long arr[] = { 2, 12, 4, 54, 6 };
        int n = 5;
        long res = cost(arr, n);
        System.out.println(res);
    }
}

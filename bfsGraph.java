package leetcode;

import java.util.ArrayList;
import java.util.*;

public class bfsGraph {
    public ArrayList<Integer> bfs(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int size = adj.size();
        boolean vis[] = new boolean[size];
        q.add(0);
        vis[0] = true;
        while (!q.isEmpty()) {
            int pop = q.poll();
            result.add(pop);
            for (int i = 0; i < adj.get(pop).size(); i++) {
                int curr = adj.get(pop).get(i);
                if (!result.contains(curr) && vis[curr] != true) {
                    q.add(curr);
                    vis[curr] = true;
                }
            }
        }
        return result;
    }
}

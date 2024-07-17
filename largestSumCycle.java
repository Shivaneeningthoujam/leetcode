package leetcode;

public class largestSumCycle {
    long sum;

    public long largestSum(int N, int Edge[]) {
        long[] val = new long[N];
        sum = -1L; // 'L' suffix denotes the variable is of long type
        for (int i = 0; i < N; i++) {
            if (Edge[i] > -1) {
                bt(i, 0L, Edge, val);
            }
        }
        return sum;
    }

    public void bt(int idx, long curSum, int[] edge, long[] vals) {
        if (edge[idx] == -1)
            return; // no more outgoing edges from current node
        if (edge[idx] == -2) {
            sum = Math.max(sum, curSum - vals[idx]);
            return;
        }
        edge[idx] = -2; // mark the current node as visited
        vals[idx] = curSum; // store total index sum till now
        bt(edge[idx], curSum + idx, edge, vals);
        edge[idx] = -1; // making past visited or making invalid to avoid visit next time
    }

    public static void main(String[] args) {
        // Input: N = 4
        // Edge[] = {1, 2, 0, -1}
        // Output: 3
        // Explanation:
        // There is only one cycle in the graph.
        // (i.e 0->1->2->0)
        // Sum of the cell index in that cycle
        // = 0 + 1 + 2 = 3.
        int N = 4;
        int Edge[] = { 1, 2, 0, -1 };
        largestSumCycle ob = new largestSumCycle();
        System.out.println(ob.largestSum(N, Edge));
    }
}

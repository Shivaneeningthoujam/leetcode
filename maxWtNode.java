package leetcode;

public class maxWtNode {
    // Given a maze with N cells. Each cell may have multiple entry points but not
    // more than
    // one exit (i.e entry/exit points are unidirectional doors like valves).
    // You are given an array Edge[] of N integers, where Edge[i] contains the cell
    // index that can be
    // reached from cell i in one step. Edge[i] is -1 if the ith cell doesn't have
    // an exit.
    // The task is to find the cell with maximum weight (The weight of a cell is the
    // sum of cell indexes
    // of all cells pointing to that cell). If there are multiple cells with the
    // maximum weight return the
    // cell with highest index.
    // Note: The cells are indexed with an integer value from 0 to N-1.
    // If there is no cell pointing to the ith cell then the weight of the i'th cell
    // is zero.
    public static int maxWtCell(int N, int Edge[]) {
        N = Edge.length;
        int[] weight = new int[N];
        for (int i = 0; i < N; i++) {
            // initialise the weight array as zero
            weight[i] = 0;
        }
        // Calculate the weights
        for (int i = 0; i < N; i++) {
            if (Edge[i] != -1) {// Edge[i] is not -1 means the exit path exists
                weight[Edge[i]] += i;// Question says weight is the sum of the indices
            }
        }
        // find cell with max weight
        int maxWeight = Integer.MIN_VALUE;
        int maxWeightCell = -1;
        for (int i = 0; i < N; i++) {
            if (weight[i] > maxWeight || weight[i] == maxWeight && i > maxWeightCell) {
                maxWeight = weight[i];
                maxWeightCell = i;
            }
        }
        return maxWeightCell;
    }

    public static void main(String[] args) {
        // N = 4
        // Edge[] = {2, 0, -1, 2}
        // Output: 2
        // Explanation:
        // 1 -> 0 -> 2 <- 3
        int N = 4;
        int Edge[] = { 2, 0, -1, 2 };
        System.out.println(maxWtCell(N, Edge));
        // Explanation:
        // 1 -> 0 -> 2 <- 3
        // weight of 0th cell = 1
        // weight of 1st cell = 0
        // (because there is no cell pointing to the 1st cell)
        // weight of 2nd cell = 0+3 = 3
        // weight of 3rd cell = 0
        // There is only one cell which has maximum weight
        // (i.e 2) So, cell 2 is the output.
    }
}

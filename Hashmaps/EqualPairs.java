package Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class EqualPairs {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<String, Integer> hp = new HashMap<>();
        for (int[] row : grid) {
            String rowStr = Arrays.toString(row);
            hp.put(rowStr, hp.getOrDefault(rowStr, 0) + 1);
        }
        int count = 0;
        for (int j = 0; j < n; j++) {
            int[] col = new int[n];
            for (int i = 0; i < n; i++) {
                col[i] = grid[i][j];
            }
            count += hp.getOrDefault(Arrays.toString(col), 0);
        }
        return count;
    }
}

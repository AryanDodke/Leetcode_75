package Hashmaps;

import java.util.Arrays;

public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int[] k = new int[2001];

        for (int i : arr) {
            k[i + 1000]++;
        }

        Arrays.sort(k);
        for (int i = 0; i < 2000; i++) {
            if (k[i] != 0 && k[i] == k[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

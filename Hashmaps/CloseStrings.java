package Hashmaps;

import java.util.Arrays;

public class CloseStrings {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false; // If lengths are different, they can't be close strings
        }

        int[] freq_word1 = new int[26];
        int[] freq_word2 = new int[26];

        boolean[] isPresent_word1 = new boolean[26];
        boolean[] isPresent_word2 = new boolean[26];

        // Count frequencies and mark presence of characters in word1
        for (int i = 0; i < word1.length(); i++) {
            char c = word1.charAt(i);
            freq_word1[c - 'a']++;
            isPresent_word1[c - 'a'] = true;
        }

        // Count frequencies and mark presence of characters in word2
        for (int i = 0; i < word2.length(); i++) {
            char c = word2.charAt(i);
            freq_word2[c - 'a']++;
            isPresent_word2[c - 'a'] = true;
        }

        // Sort frequency arrays
        Arrays.sort(freq_word1);
        Arrays.sort(freq_word2);

        // Compare sorted frequency arrays and presence arrays
        return Arrays.equals(freq_word1, freq_word2) && Arrays.equals(isPresent_word1, isPresent_word2);
    }
}

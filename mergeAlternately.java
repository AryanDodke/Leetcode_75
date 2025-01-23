public class MergeAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        int s1 = word1.length();
        int s2 = word2.length();
        int index = 0;
        while (s1 > index || s2 > index) {
            if (s1 > index)
                builder.append(word1.charAt(index));
            if (s2 > index)
                builder.append(word2.charAt(index));
            index++;
        }
        return builder.toString();
    }
}
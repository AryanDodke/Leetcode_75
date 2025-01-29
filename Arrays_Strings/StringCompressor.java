public class StringCompressor {
    public int compress(char[] chars) {
        int n = chars.length;
        int index = 0;  // Position to write the compressed characters
        
        int i = 0;
        while (i < n) {
            char ch = chars[i];
            int count = 0;
            
            // Count occurrences of chars[i]
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }
            
            // Store character
            chars[index++] = ch;

            // If count > 1, store its digits
            if (count > 1) {
                for (char digit : Integer.toString(count).toCharArray()) {
                    chars[index++] = digit;
                }
            }
        }
        return index;  // New compressed length
    }
}

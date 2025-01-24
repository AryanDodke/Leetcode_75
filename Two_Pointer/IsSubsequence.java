package Two_Pointer;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int n = s.length();
        int i = 0;
        for (char c : t.toCharArray())
            if (s.charAt(i) == c && ++i == n) {
                return true;
            }
        return false;
    }
}

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        StringBuilder builder = new StringBuilder();
        int i = 0;
            if (str1.charAt(i) == str2.charAt(i)) {
                builder.append(str2);
            } else {
                return "";
            }
            i++;
        return builder.toString();
    }
}
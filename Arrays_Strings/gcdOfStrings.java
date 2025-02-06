public class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
       int c = str1.length();
       int d = str2.length();
       if (!(str1 + str2).equals(str2 + str1)) {
        return "";
       }
       String result = str1.substring(0, gcd(c, d));
       return result;
    }

    private int gcd(int a, int b){
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
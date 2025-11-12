public class PalindromeRecur {
    public static void main(String[] args) {
        String s = "ABCBA";
        PalindromeStr p = new PalindromeStr();
        System.out.print(p.pal(0, s));
    }
}

class PalindromeStr {
    public boolean pal(int i, String s) {
        if(i > s.length()/2) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
        return pal(i + 1, s);
    }
}
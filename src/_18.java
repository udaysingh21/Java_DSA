// Check if a string is Palindrome or not

public class _18 {

    public boolean palindrome(int i, int j, String s) {

        if (i>=j) { return true; }

        if (s.charAt(i)!=s.charAt(j)) {
            return false;
        } else {
            return palindrome(i+1,j-1,s);
        }
    }

    public static void main(String[] args) {
        _18 obj = new _18();
        String s = "maddeam";
        System.out.println(obj.palindrome(0,s.length()-1,s));
    }
}

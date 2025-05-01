// A palindrome number is a number which reads the same both left to right and right to left.
// If original and reversed number are equal , then it is palindrome

public class _6 {

    public boolean revese(int num) {
        // Assuming n is positive
        int orig = num;
        int rev_num=0;
        while (num>0) {
            int rem = num%10;
            num = num/10;
            rev_num = rev_num*10+rem;
        }

        return orig == rev_num;
    }

    public static void main(String[] args) {
        _6 obj = new _6();
        System.out.println(obj.revese(1231));
    }
}

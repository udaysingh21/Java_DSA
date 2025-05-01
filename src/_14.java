// Sum of first N natural numbers using Recursion

public class _14 {

    public int sumN(int n) {
        if (n==0) { return 0; }

        return n+sumN(n-1);
    }

    public static void main(String[] args) {
        _14 obj = new  _14();
        System.out.println(obj.sumN(15));
    }
}

// Print 1-N times using Recursion

public class _12 {

    public void printtillN(int n) {
        if (n==0) { return; }

        printtillN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        _12 obj = new _12();
        obj.printtillN(5);
    }
}

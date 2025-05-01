// Print N to 1 using recursion

public class _13 {

    public void printtill1(int n) {
        if (n==0) { return; }

        System.out.println(n);
        printtill1(n-1);
    }

    public static void main(String[] args) {
        _13 obj = new _13();
        obj.printtill1(5);
    }
}

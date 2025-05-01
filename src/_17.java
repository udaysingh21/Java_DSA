// Fibonacci Series

public class _17 {

    public int fibonacci(int n) {
        if (n==0) { return 0; }
        if (n==1) { return 1; }

        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        _17 obj = new _17();
        System.out.println(obj.fibonacci(20));
    }
}

// Factorial of N numbers

public class _15 {

    public int factorial(int n) {
        if (n==1) { return 1;}

        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        _15 obj = new _15();
        System.out.println(obj.factorial(6));
    }

}

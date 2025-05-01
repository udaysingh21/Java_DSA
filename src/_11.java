// Understanding Recursion by printing your name N time

public class _11 {

    public void printName(int n) {
        if (n==0) { return; }

        System.out.println("Uday Vikram Singh");
        printName(n-1);
    }

    public static void main(String[] args) {
        _11 obj = new _11();
        obj.printName(15);
    }
}

public class Function {

    public void demo(int n, Integer m) {
        n = 20; // changes the local copy of n - inside main() it will not reflect
        m = 20; // changes the local reference of m - inside main() it will not reflect
    }

    public static void main(String[] args) {
        int n = 10; // Passed as a value
        Integer m = 10; // Passed as a reference
        Function obj = new Function();
        obj.demo(n,m);
        System.out.println(n+" "+m);
    }
}

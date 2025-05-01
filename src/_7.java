public class _7 {

    public int gcd(int n1, int n2) {
        int smaller = Math.min(n2, n1);

        while (smaller!=0) {
            if (n1%smaller==0 && n2%smaller==0) {
                return smaller;
            }
            smaller-=1;
//            System.out.println(smaller);
        }
        return 1;

    }

    public int gcd1(int n1, int n2) {
        while (n2!=0) {
            int temp = n1%n2;
            n1=n2;
            n2=temp;
        }
        return n1;

    }

    public static void main(String[] args) {
        _7 obj = new _7();
        System.out.println(obj.gcd(60,48));
        System.out.println(obj.gcd1(60,48));

    }
}

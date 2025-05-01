public class _8 {

    public int countDigits(int n) {
        if (n==0) { return 1; }
        if (n<0) { n=-1*n; }

        int count=0;

        while (n>0) {
            n=n/10;
            count+=1;
        }

        return count;
    }

    public boolean armstrong(int n) {
        int c = countDigits(n);
        int orig = n;
        int an = 0;
        while (n!=0) {
            int rem=n%10;
            n = n/10;
            an = an + (int) Math.pow(rem,c);
        }

        System.out.println(orig);
        System.out.println(an);
        return orig == an;


    }

    public static void main(String[] args) {
        _8 obj = new _8();
        System.out.println(obj.armstrong(153));
    }
}

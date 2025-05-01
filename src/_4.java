//You are given an integer n. You need to return the number of digits in the number.


public class _4 {

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

    public static void main(String[] args) {
        _4 obj = new _4();
        System.out.println(obj.countDigits(-123));

    }
}

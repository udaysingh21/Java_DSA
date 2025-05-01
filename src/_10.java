public class _10 {
    public boolean isPrime(int n) {
        int x =1;
        int cnt=1;
        while (x<n) {
            if (n%x == 0) {
                cnt+=1;
            }
            x+=1;
        }
        return cnt == 2;

    }

    public static void main(String[] args) {
        _10 obj = new _10();
        System.out.println(obj.isPrime(132));
    }
}

// You are given an integer n. Return the integer formed by placing the digits of n in reverse order.
public class _5 {

    public int revese(int num) {
        int rev_num=0;
        boolean flag=true;
        if (num<0) {
            num=-1*num;
            flag=false;
        }
        while (num>0) {
            int rem = num%10;
            num = num/10;
            rev_num = rev_num*10+rem;
        }

        return !flag ? -1*rev_num : rev_num;
    }

    public static void main(String[] args) {
        _5 obj = new _5();
        System.out.println(obj.revese(121));
    }
}

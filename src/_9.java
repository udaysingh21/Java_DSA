import java.util.ArrayList;
import java.util.Arrays;

public class _9 {

    public ArrayList<Integer> divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        int x=1;
        while (x<=n) {
            if (n%x==0) {
                arr.add(x);
//                System.out.println(arr);
            }
            x+=1;
        }

        return arr;
    }

    public static void main(String[] args) {
        _9 obj = new _9();
        System.out.println(obj.divisors(8));
    }
}

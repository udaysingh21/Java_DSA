// Count frequency of each element in array

import java.util.Arrays;

public class _19 {

    public int[] countfrequency(int[] arr) {
        int[] hash = new int[Arrays.stream(arr).max().getAsInt()+1];

        for (int i: arr) {
            hash[i]+=1;
        }

        return hash;

    }

    public static void main(String[] args) {
        _19 obj = new _19();
        int[] arr = {10,5,10,15,10,5};
        System.out.println(Arrays.toString(obj.countfrequency(arr)));

    }
}

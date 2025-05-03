// Highest Occurring Element in an Array

import java.util.Arrays;

public class _20 {

    public int highest(int[] arr) {
        int[] hash = new int[10];  // by default value is zero

        for (int i: arr) {
            hash[i%10]+=1;
        }

//        System.out.println(Arrays.toString(hash));

        int highest=0;
//        for (int i: hash) {
//            if (i>highest){
//                highest=i;
//            }
//        }

        for (int i=0;i<hash.length;i++) {
//            System.out.println(i+" "+highest);
            if (hash[i]>hash[highest]) {
                highest=i;
            }
        }

        return highest;
    }

    public static void main(String[] args) {
        _20 obj = new _20();
//        int[] arr = {1,2,2,2,3,3,3};
        int[] arr = {4,4,5,5,6};
        System.out.println(obj.highest(arr));
    }
}

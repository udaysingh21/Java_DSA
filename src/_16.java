import java.util.Arrays;

public class _16 {
    public void reverse(int i, int j, int[] arr) {
        if (i>=j) { return; }

        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        reverse(i+1,j-1,arr);

    }

    public void reverseArray(int n,int[] arr) {
        int i=0;
        int j=n-1;

        reverse(i,j,arr);
    }

    public static void main(String[] args) {
        _16 obj = new _16();
        int[] arr = {10,20,30,40,50};
        obj.reverseArray(5,arr);
        System.out.println(Arrays.toString(arr));
    }
}

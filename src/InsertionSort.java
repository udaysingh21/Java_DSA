// Build the sorted array one element at a time by inserting each element into its correct position among the already sorted elements.

import java.util.Arrays;

public class InsertionSort {

    public void insertionSort(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            int j=i-1;
            while (j>=0 && nums[j]>x){
                nums[j+1]=nums[j];
                j-=1;
            }
            nums[j+1]=x;
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] nums = {32,0,1,84,35};
        obj.insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}

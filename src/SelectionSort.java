import java.util.Arrays;

// For each index i, find the minimum element from i to end and swap it with nums[i] to sort the array.

public class SelectionSort {
    public void selectionSort(int[] nums) {
        for (int i=0;i<nums.length-1;i++) {
            int min_idx = i; // Consider the first index as min and trying to find the smaller value that min_idx using nested loop
            for (int j=i;j<nums.length;j++) {
                if (nums[j]<nums[min_idx]) {
                    min_idx=j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[min_idx];
            nums[min_idx]=temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {64,25,12,22,11};
        SelectionSort obj = new SelectionSort();
        obj.selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

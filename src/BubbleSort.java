// Repeatedly compare and swap adjacent elements if they are in the wrong order, bubbling the largest to the end each pass.

import java.util.Arrays;

public class BubbleSort {

    public void bubbleSort(int[] nums) {

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if (nums[i]>nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        BubbleSort obj = new BubbleSort();
        int[] nums = {6,2,12,22,1};
        obj.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}

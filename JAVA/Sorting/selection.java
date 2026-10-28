package Sorting;
import java.util.*;

public class selection {
    public static void main(String[] args) {
        int[] nums = { 7, 4, 1, 5, 3 };
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums) {
        for (int end = nums.length - 1; end > 0; end--) {
            int maxIndex = 0;
            for (int i = 1; i <= end; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = nums[end];
            nums[end] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }
}
// package Leetcode;

import java.util.*;

public class Leetcode_167 {
    public static void main(String[] args) {
        int[] arr = { 2, 7, 11, 15 };
        int[] ans = twoSum(arr, 9);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[] { i + 1, j + 1 };
            } else if (sum > target) {
                j = binSearchRight(numbers, i, j - 1, target - numbers[i]);
            } else {
                i = binSearchLeft(numbers, i + 1, j, target - numbers[j]);
            }

        }
        return new int[] { -1, -1 };
    }

    public static int binSearchRight(int[] num, int low, int high, int tar) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (num[mid] > tar) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;
    }

    public static int binSearchLeft(int[] num, int low, int high, int tar) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (num[mid] < tar) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }
}

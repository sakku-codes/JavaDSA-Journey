import java.util.*;
public class firstRepeating {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
        
        System.out.println(check(arr));

    }
    // find the element repeating first in the array..........

    public static int check(int[] nums) {
        HashMap<Integer,Integer> freq = new HashMap<>(); //takes O(n) time complexity
        // for (int i = 0; i < nums.length - 2; i++) {
        //     int left = i + 1;
        //     int right = nums.length - 1;

        //     while (left < right) {
        //         if (nums[left] == nums[i] || nums[right] == nums[i]) {
        //             return nums[i];
        //         } else {
        //             left++;
        //             if (left < right) {
        //                 right--;
        //             }
        //         }
        //     }
        // }

        for(int i : nums){
            freq.put(i,freq.getOrDefault(i, 0)+1);
        }

        for(int i : nums){
            if(freq.get(i) > 1){
                return i;
            }
        }
        return -1;
    }
}

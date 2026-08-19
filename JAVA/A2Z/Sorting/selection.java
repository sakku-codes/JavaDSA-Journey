import java.util.*;


public class selection {
    public static void main(String[] args) {
        int[] nums = {7,4,1,5,3};
        nums = selectionSort(nums);
        System.out.println(Arrays.toString(nums));


    }
    static int[] selectionSort(int[] nums) {
        
        int count = 0;
        int i = 0;
        int j = 0;
        while(count<nums.length-1){
        int max = Integer.MIN_VALUE;
        for(i=0; i<nums.length-count; i++){

            if(nums[i] > max){
                max = nums[i];
                j=i;
            }
            

        }
        if(i == nums.length-count){
            int temp = nums[i-1];
            nums[i-1] = nums[j];
            nums[j] = temp;

        }
        
        count++;
        }
        return nums;
    }
}


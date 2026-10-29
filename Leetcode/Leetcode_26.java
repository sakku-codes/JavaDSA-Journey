public class Leetcode_26 {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int result = removeDuplicates(arr);

        System.out.println(result);

    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        while(j<nums.length){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
                j++;
            }
            else{
                j++;
            }
            
        }
        return i+1;
    }
}

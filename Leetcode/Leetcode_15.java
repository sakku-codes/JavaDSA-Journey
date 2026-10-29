import java.util.*;

public class Leetcode_15 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] arr = {-1,0,1,2,-1,-4};

        ans = threeSum(arr);

        System.out.println(ans);
        
    }

    public static List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> triplet = new ArrayList<>();

        int left = -1;
        int right = -1;

        Arrays.sort(nums);

        for(int i=0; i<nums.length-2 ; i++){

            if(i>0 && nums[i-1] == nums[i]){
                continue;
            }

            left = i+1;
            right = nums.length-1;

            while(left<right){

                long sum = (long) nums[left] + nums[right] + nums[i];
                if(sum == 0){
                    List<Integer> temp = new ArrayList<>( Arrays.asList(nums[left],nums[right],nums[i]));

                    triplet.add(temp);

                    left++;
                    right--;

                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }

                    while(left<right && nums[right+1] == nums[right]){
                        right--;
                    }
                }

                else if(sum-nums[i] > 0-nums[i]){
                    right--;
                }

                else{
                    left++;
                }
            }
        }
        return triplet;
    }
}

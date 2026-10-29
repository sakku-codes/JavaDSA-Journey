import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PivotElement {
    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};

        int ans = findingPivot(nums);

        System.out.println(ans);
    }

    public static int findingPivot(int[] nums){
        // HashMap<Integer,Integer> leftSum = new HashMap<>();
        // HashMap<Integer,Integer> rightSum = new HashMap<>();
        int index = -1;
        // for(int i=1; i<nums.length ; i++){
        //     if(i==1){
        //         leftSum.put(0,0);
        //     }
        //     leftSum.put(i, leftSum.getOrDefault(i-1, 0)+nums[i-1]);
        // }
        

        // for(int i=nums.length-2; i>=0 ; i--){
        //     if(i==nums.length - 2){
        //         rightSum.put(nums.length-1,0);
        //     }
        //     rightSum.put(i, rightSum.getOrDefault(i+1 ,0)+nums[i+1]);
        // }

        // for(int i=0;i<nums.length;i++){
        //     if(leftSum.get(i).equals(rightSum.get(i))){
        //         index = i;
        //         break;
        //     }
        // }

        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        leftSum[0] = nums[0];
        rightSum[nums.length-1] = nums[nums.length-1];

        for(int i = 1; i<nums.length ; i++){
            leftSum[i] = nums[i] + leftSum[i-1];
            rightSum[nums.length-i-1] = nums[nums.length-i-1] + rightSum[nums.length-i];
        }

        for(int i = 0; i<nums.length ; i++){
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }

        return index;


    }
}

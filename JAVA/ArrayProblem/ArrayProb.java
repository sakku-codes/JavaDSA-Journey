
// package JAVA.ArrayProblem;
import java.util.*;

public class ArrayProb {
    public static void main(String[] args) {

        // int[] arr = { 0, 0, 0, 1, 1, 2, 2, 2, 3, 4, 4, 4, 5, 5, 6 };
        // int[] arr2 = {4,7,8,14,13,0,1,5,3,2,6,10,11,12};
        // int[] ShiftedArray = rightShiftArray(arr);
        // System.out.println(Arrays.toString(ShiftedArray));
        // int k = 3;
        // int[] shiftedKArray = shiftKplaces(arr,k);
        // System.out.println(Arrays.toString(shiftedKArray));

        // ExtremeElements(arr);

        // int mode = modeOfArray(arr);

        // String union = Arrays.toString(unionOfArrays(arr, arr2));

        // System.out.println("Union of the Arrays is : " + union);

        int[] arr012 = { 0, 1, 2, 1, 1, 2, 0, 1, 0, 0, 1, 1, 2, 0};

        // segregate 0's and 1's like : {0,0,............,1,1,...........}

        // System.out.println(Arrays.toString(segregation(arr01)));

        // int missingNum = missingNumber(arr2);
        // System.out.println(missingNum);
        segregate012(arr012);
        System.out.println(Arrays.toString(arr012));

    }
    public static int missingNumber(int[] a){
        // Approach one simple -addition 

        int n = a.length;

        // int sumofn = (n*(n+1))/2;
        // int sumOfarr = 0;
        // for(int num : a){
        //     sumOfarr += num;
        // }

        // return (sumofn - sumOfarr);

        // Approach 2 - XOR (^) : since a^a=0 and a^0=a so => 
            
            int xorSum = 0;

            for(int i=0;i<=n;i++){
                xorSum ^= i;
            }
            for(int num : a){
                xorSum ^= num;
            }

            return xorSum;

    }

    public static int[] segregation(int[] a){
        int left = 0;
        int right = a.length - 1;

        while(left<right){
            while(a[left] == 0 && left<right){
                left++;
            }

            while(a[right] == 1 && left<right){
                right--;
            }

            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }
        return a;
    }
    public static void segregate012(int[] a){
        int zero = 0;
        int one = 0;
        int two = a.length-1;
        int two2 = a.length-1;

        while(zero<two){
            if(a[two] == 2){
                two--;
            }
            if(a[zero] != 2){
                zero++;
            }

            if(a[two] != 2 && a[zero] == 2){
                a[zero] = a[two];
                a[two] = 2;
            }

        }
        while(one<two2){
            if(a[one] == 1 && a[two2] == 0){
                a[one] = 0;
                a[two2] = 1;
            }
            if(a[one] == 0){
                one++;
            }
            if(a[two2] != 0){
                two2--;
            }

        }
    }


    public static int[] reverseAnArray(int[] a) {
        if (a.length == 0) {
            return a;
        }

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        return a;
    }

    public static int[] rightShiftArray(int[] a) {

        if (a.length == 0) {
            return a;
        }

        int prev = a[0];
        int curr;
        int i = 0;
        while (i < a.length - 1) {
            curr = a[i + 1];
            a[i + 1] = prev;
            prev = curr;
            i++;
        }
        a[0] = prev;

        return a;

    }

    public static int[] shiftKplaces(int[] a, int k) {

        if (a.length == 0) {
            return a;
        }

        int[] Kprev = new int[k];
        int i = a.length - 1;

        for (int j = a.length - k; j < a.length; j++) {
            Kprev[j - 4] = a[j];
        }
        while (i > k - 1) {
            a[i] = a[i - k];
            i--;
        }

        for (int l = 0; l < k; l++) {
            a[l] = Kprev[l];
        }

        return a;

    }

    public static void ExtremeElements(int[] a) {
        int i = 0;
        int j = a.length - 1;

        while (i <= j) {
            if (i == j) {
                System.out.print(a[i]);
                return;
            }

            else {
                System.out.print(a[i] + ",");
                i++;
                System.out.print(a[j] + ",");
                j--;
            }
        }
        return;
    }

    public static int modeOfArray(int[] a) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : a) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + "-->" + e.getValue());
        }
        int min = Integer.MAX_VALUE;
        int mode = -1;
        for (int num : freq.keySet()) {
            if (freq.get(num) < min) {
                min = freq.get(num);
                mode = num;
            }
        }
        return mode;
    }

    public static Object[] unionOfArrays(int[] A1, int[] A2) {
        HashSet<Integer> union = new HashSet<>();
        for (int num : A1) {
            union.add(num);
        }

        for (int num : A2) {
            union.add(num);
        }

        return union.toArray();
    }

}

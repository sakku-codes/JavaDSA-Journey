// package JAVA.ArrayProblem;
import java.util.*;

public class ArrayProb {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6 };
        // int[] ShiftedArray = rightShiftArray(arr);
        // System.out.println(Arrays.toString(ShiftedArray));
        int  k = 3;
        // int[] shiftedKArray = shiftKplaces(arr,k);
        // System.out.println(Arrays.toString(shiftedKArray));


        ExtremeElements(arr);



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

        if(a.length == 0){
            return a;
        }

        int prev = a[0];
        int curr;
        int i = 0;
        while(i < a.length - 1){
            curr = a[i+1];
            a[i+1] = prev;
            prev = curr;
            i++;
        }
        a[0] = prev;

        return a;

    }

    public static int[] shiftKplaces(int[] a, int k) {

        if(a.length == 0){
            return a;
        }

        int[] Kprev = new int[k];
        int i = a.length-1;

        for(int j = a.length-k;j<a.length;j++){
            Kprev[j-4] = a[j];
        }
        while(i > k-1){
            a[i] = a[i-k];
            i--;
        }
        
        for(int l=0;l<k;l++){
            a[l] = Kprev[l];
        }

        return a;

    }

    public static void ExtremeElements(int[] a){
        int i = 0;
        int j = a.length-1;

        while(i<=j){
            if(i==j){
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

    

}

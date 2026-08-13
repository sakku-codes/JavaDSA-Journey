package Leetcode;
public class Leetcode121 {
    public static void main(String[] args){
        int[] arr = new int[7];
        arr[0] = 7;
        arr[1] = 6;
        arr[2] = 5;
        arr[3] = 4;
        arr[4] = 3;
        arr[5] = 2;
        arr[6] = 1;
        int result = solve(arr);
    }

    public static int solve(int[] a){
        int max = a[0];
        int min = a[a.length-1];
        for(int i=1,j=a.length-1 ;i<a.length && j>0 ;i++,j--){
            if(max < a[i]){
                max = a[i];
            }
            if(min > )
        }

        return 0;
    }
}

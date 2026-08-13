import java.util.Arrays;

public class StrictlySortedArrayBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        int[] result = new int[2];
        result = findInStrictMatrix(arr, 16);
        System.out.println(Arrays.toString(result));
    }

    static int[] findInStrictMatrix(int[][] mat , int target){
        int[] result ={-1,-1};
        int row = 0;
        int col = 3;

        while(row < 4&& col >=0){
            if(mat[row][col] == target){
                result[0] = row;
                result[1] = col;
            }
            if(mat[row][col]>target ){
                col--;
            }
            else{
                row++;
            }
            
    }
    return result;
}
}


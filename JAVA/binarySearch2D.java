import java.util.Arrays;

public class binarySearch2D {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 30, 40},
            {12, 23, 34, 35, 45},
            {44, 56, 78, 89}   //this is not strictly sorted array
        };
        int[] result = new int[1]; 
        result = findIn2D(matrix, 56);
        System.out.println(Arrays.toString(result));
    }

    static int[] findIn2D(int[][] mat, int target){
        int[] result = {-1,-1};
        int row = 0;
        int column = mat[row].length-1;
        while(row < mat.length && column >=0){
            if(mat[row][column] == target){
                result[0]= row;
                result[1]= column;
                return result;
            }
            if(mat[row][column] > target){
                column--;
            }
            else{
                row++;
                column = mat[row].length-1;
            }
        }
        return result ;
    }
}

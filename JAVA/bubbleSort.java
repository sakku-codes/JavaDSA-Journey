import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,23,4,45,6,9,7,34,876};
        
        SortThis(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SortThis(int[] a){
         for(int i=0; i < a.length; i++){
            boolean swapped = false;
            for(int j=1; j < a.length - i; j++){
                if(a[j] < a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;

                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
         }
    }
}

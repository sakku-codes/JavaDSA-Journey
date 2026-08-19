public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {1,3,55,6,23,67};
        
    }
    static void SortThis(int[] a){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            int j;
            if(a[i] > max){
                max = a[i];
                j = i;
                
            }
            if(i == a.length-1){
                
                a[i] = max; 

            }
        }
    }
}

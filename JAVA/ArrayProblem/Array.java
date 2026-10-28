import java.util.*;
public class Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] a = new int[6];

        // input the array

        // int[] a = {12,45,56,78,45,76};

        // take user input
        // System.out.println("Enter the values in the array: ");
        // // simple for loop
        // for(int i=0; i<a.length ; i++){
        //     a[i] = in.nextInt();
        // }

        // forEach loop this loop can't use for the input the array data
        // because it is local variable so can't update the orginal array element


        // for(int num : a){
        //     System.out.print(num + ",");
        // }
        // System.out.println();

        // System.out.println(Arrays.toString(a));

        String[] name = {"Sakku" , "Raghav" , "nischay"};
        System.out.print(Arrays.toString(name));
        changeName(name);

        System.out.print(Arrays.toString(name));
        
    
    }

    // the non primitives arrya is stored into the heap memory and 
    // the array stores the reference to the elements in the heap so they are changable through the 
    // reference 

    

    public static void changeName(String[] a){
        a[0] = "Saksham garg" ;
    }     

}

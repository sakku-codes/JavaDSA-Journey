import java.util.*;

public class L1 {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>();
        List<Integer> nums = new ArrayList<>(); //can be decalared aas this
        Collection<Integer> nums2 = new ArrayList<>();//also as this
        num.add(30);
        num.add(57);
        num.add(46);

        ArrayList<Integer> num2 = new ArrayList<>();
        num2.add(76);
        num2.add(34);
        num.addAll(num2);
        Iterator<Integer> iter = num.iterator();
        while(iter.hasNext()){
            System.out.println("Element : " + iter.next());
        }
        Collections.sort(num);
        System.out.println(num);
        Object[] arr = num.toArray();
        for(int i=arr.length-1; i>=0 ; i--){
            System.out.print(arr[i]+" ");

        } 
        System.out.println();

        ArrayList<Integer> newNum = (ArrayList<Integer>)num.clone();
        System.out.println(newNum);
        newNum.add(1000);
        System.out.println(newNum);

    }
}
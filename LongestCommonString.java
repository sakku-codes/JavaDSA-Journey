public class LongestCommonString{
    public static void main(String args[]){
        String[] arr = {"flower","flow","flight"};
        String result = findLongestString(arr);
        System.out.println(result);
        
    }
     public static String findLongestString(String[] a){
        StringBuilder str = new StringBuilder();
        int minString = findTheMInimumString(a);
        
        if(a==null || a.length == 0){ return "";}
        for(int i = 0; i < a.length ; i++){
            char currentChar = a[0].charAt(i);
            for(int j =1 ;j<a.length ; j++){
                if(currentChar != a[j].charAt(i)){
                    return str.toString();
                }
            }
            str.append(currentChar);
                

        }
        return str.toString();
            
    }

        public static int findTheMInimumString(String[] a){
            int smallestString = Integer.MAX_VALUE;
            for(int i = 0; i < a.length ; i++){
                if(smallestString > a[i].length()){
                    smallestString = a[i].length();
                    
                }
            }
            return smallestString;
        }
}







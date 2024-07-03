package Problems;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean checkDuplicates(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length; i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        return set.size() != arr.length;
    }

    public static void main(String[] args) {
        int[] n = new int[] {1,2,3,4,5,5};
        System.out.println(checkDuplicates(n));
    }

}

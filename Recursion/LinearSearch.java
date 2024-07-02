package Recursion;

import java.sql.SQLOutput;

public class LinearSearch {

    public static int search(int[] arr,int target,int pos){
        //base case
        if(pos == arr.length)
            return -1;
        if(arr[pos] == target)
            return pos;
        pos = search(arr,target,pos+1);
        return pos;
    }

    public static void main(String[] args) {
        int[] n = new int[] {1,2,3,4,5,6,7};
        System.out.println("Linear Search : " + search(n,5,0));
    }

}

package Recursion;

public class TwoAdjacentDuplicateRemoval {

    public static String removeDuplicates(String str,int idx){

        //base case
        if(idx == str.length()-1)
            return str;

        if(str.charAt(idx) == str.charAt(idx+1))
            return removeDuplicates(str.substring(0,idx) + str.substring(idx+2),0);
        else
            return removeDuplicates(str,idx+1);

    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca",0));
    }

}

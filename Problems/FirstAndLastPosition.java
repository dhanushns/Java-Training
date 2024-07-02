package Problems;

import java.util.ArrayList;
public class FirstAndLastPosition {

    public static ArrayList<Integer> findPositions(int[] arr,int target){
        ArrayList<Integer> res = new ArrayList<>();
        int start = -1,end = -1;

        //finding the start position
        for(int i = 0 ; i < arr.length; i++){
            if(target == arr[i]) {
                start = i;
                break;
            }
        }

        if(start != -1){
            //finding the last position
            for(int i = start+1; i < arr.length; i++){
                if(target == arr[i]){
                    end = i;
                    break;
                }
            }
        }
        res.add(start);
        res.add(end);
        return res;
    }

    //Recursion
    public static ArrayList<Integer> findPositions(int[] arr, int target,int start,int end,int pos,ArrayList<Integer> res){

        //base case
        if(pos == arr.length){
            res.add(start);
            res.add(end);
            return res;
        }
        if(arr[pos] != target)
            findPositions(arr,target,start,end,pos+1,res);
        else if(start == -1)
            findPositions(arr,target,pos,end,pos+1,res);
        else
            findPositions(arr,target,start,pos,pos+1,res);

        return res;
    }

    public static void main(String[] args) {
        int[] n = new int[] {5,7,7,8,8,10};
        System.out.println(findPositions(n,10));
        System.out.println(findPositions(n,10,-1,-1,0,new ArrayList<>()));
    }
}

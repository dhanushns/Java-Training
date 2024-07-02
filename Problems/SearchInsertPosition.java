package Problems;

public class SearchInsertPosition {

    public static int search(int[] arr,int target,int pos){
        //base case
        if(pos == arr.length)
            return pos;
        if(arr[pos] == target)
            return pos;
        if(arr[pos] > target)
            return pos;
        pos = search(arr,target,pos+1);
        return pos;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,3,5,6};
        System.out.println(search(arr,7,0));
    }

}

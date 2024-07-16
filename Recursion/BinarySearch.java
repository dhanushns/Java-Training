package Recursion;

public class BinarySearch {

    public static int search(int[] arr,int target, int start, int end, int mid){
        //basecase
        if(start > end)
            return -1;
        mid = (start + end)/2;
        if(arr[mid] == target)
            return mid;
        if(arr[mid] < target)
            start = mid + 1;
        else
            end = mid - 1;
        mid = search(arr,target,start,end,mid);
        return mid;
    }

    public static void main(String[] args) {
        int[] n = new int[] {1,2,3,4,5,6,7};
        System.out.println("Binary Traversing : " + search(n,6,0,n.length-1,0));
    }

}

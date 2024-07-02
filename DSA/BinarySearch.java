package DSA;

public class BinarySearch {

    public static int search(int[] arr,int target){
        int start = 0, end = arr.length-1;
        int mid = (start + end)/2;
        while(arr[mid] != target){
            if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
            if(start > end)
                return -1;
            mid = (start + end)/2;
        }
        return mid;
    }

    public static void main(String[] args) {

        int[] n = new int[] {1,2,3,4,5,6,7};
        System.out.println(search(n,7));

    }

}

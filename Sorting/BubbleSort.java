package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] arr){

        int n = arr.length;
        boolean isSwaped = false;

        for(int i = 0 ; i < n-1; i++){
            for(int j = 0 ; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwaped = true;
                }
            }
            if(!isSwaped)
                break;
        }
    }

    public static void sort(int[] arr,int n){

        //base case
        if(n == 1)
            return;

        int count = 0;
        for(int i = 0 ; i < n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count += 1;
            }
        }

        if(count == 0)
            return;

        sort(arr,n-1);

    }

    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};
        int[] copy_arr = Arrays.copyOf(arr,arr.length);
        sort(arr);
        //sort(copy_arr,arr.length);
        System.out.println("Iterative Method : " + Arrays.toString(arr));
        System.out.println("Recursive Method : " + Arrays.toString(arr));
    }

}

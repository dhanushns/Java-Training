package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static void swap(int[] arr, int i, int j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = (low-1);

        for(int j = low; j <= high-1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return (i+1);
    }

    public static void sort(int[] arr,int low,int high){

        if(low < high){

            int p = partition(arr,low,high);

            sort(arr,low,p-1);
            sort(arr,p+1,high);

        }

    }

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

}

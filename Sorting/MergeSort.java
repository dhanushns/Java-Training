package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] mergerSortedArray(int[] a, int[] b){

        int i = 0, j = 0,k = 0;
        int n1 = a.length, n2 = b.length;

        int[] sortedArray = new int[n1+n2];

        while(i < n1 && j < n2){
            if(a[i] > b[j]){
                sortedArray[k] = b[j];
                j++;
            }
            else{
                sortedArray[k] = a[i];
                i++;
            }
            k++;
        }
        while(i < n1){
            sortedArray[k] = a[i];
            i++;
            k++;
        }
        while(j < n2){
            sortedArray[k] = b[j];
            j++;
            k++;
        }
        return sortedArray;
    }

    public static int[] DivideAndConquer(int[] arr){

        if(arr.length == 1)
            return new int[] {arr[0]};

        int mid = (arr.length-1)/2;
        int[] left_subArr = new int[mid+1];
        for(int i = 0 ; i <= mid ; i++)
            left_subArr[i] = arr[i];
        int[] array_1 = DivideAndConquer(left_subArr);

        int[] right_subArray = new int[arr.length-(mid+1)];
        for(int i = mid+1, j = 0 ; i < arr.length; i++,j++){
            right_subArray[j] = arr[i];
        }
        int[] array_2 = DivideAndConquer(right_subArray);
        return mergerSortedArray(array_1,array_2);
    }


    public static void main(String[] args) {

        int[] arr = new int[] {20,10,30,50,60,5,2,80,25,-1,0};
        int[] sortedArray = DivideAndConquer(arr);
        System.out.println(Arrays.toString(sortedArray));
    }

}

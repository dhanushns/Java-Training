package Sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i < n ; i++){

            int ele = arr[i];
            int pos = i-1;

            while(pos >= 0 && arr[pos] > ele){
                arr[pos + 1] = arr[pos];
                pos = pos-1;
            }
            arr[pos+1] = ele;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

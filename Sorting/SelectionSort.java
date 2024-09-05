package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void sort(int[] arr){

        int n = arr.length;
        for(int i = 0 ; i < n-1;i++){
            int min = i;
            for(int j = i; j < n; j++){
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void sort(int[] arr,int n,int pos){

        //base case
        if(pos == n-1)
            return;

        int min = pos;
        for(int i = pos ; i < n; i++){
            if(arr[i] < arr[min])
                min = i;
        }
        int temp = arr[pos];
        arr[pos] = arr[min];
        arr[min] = temp;

        sort(arr,n,pos+1);

    }

    public static void main(String[] args) {
        int[] arr = new int[] {5,4,3,2,1};
        int[] copy_arr = Arrays.copyOf(arr,arr.length);
        sort(arr);
        sort(copy_arr,copy_arr.length,0);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(copy_arr));
    }

}

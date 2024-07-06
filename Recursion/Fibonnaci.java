package Recursion;

import java.util.Scanner;

public class Fibonnaci {

    // Less Efficiency **** Top Down Approach ***
    public static int find_fibonnaci(int n){
        if(n == 1 || n== 0)
            return n;
       return find_fibonnaci(n-1) + find_fibonnaci(n-2);
    }

    //Efficient then Top-down approach *** Memorization Technique ***
    public static long find_fibonnaci(int n, long[] mem){

        if(n == 1 || n == 0)
            return n;
        if(mem[n] != 0)
            return mem[n];

        mem[n] = (find_fibonnaci(n-1,mem) + find_fibonnaci(n-2 ,mem));
        return mem[n];

    }

    //More Efficient then other **** Bottom Up Approach ***
    public static long find(int n){
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= n ; i++){
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[n];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(find_fibonnaci(n,new long[n+1]));
        System.out.println(find(n));
        System.out.println(find_fibonnaci(n));

    }
}
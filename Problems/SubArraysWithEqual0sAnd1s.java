package Problems;

import java.util.HashMap;

public class SubArraysWithEqual0sAnd1s {

    //Brute-force Approach TC : O(n^3)
    public static int BF(int[] arr,int n){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = i+1 ; j < n ; j++){
                int zeros = 0,ones = 0;
                for(int k = i ; k <= j ; k++){
                    if(arr[k] == 0) zeros++;
                    else ones++;
                }
                if(zeros == ones) count++;
            }
        }
        return count;
    }

    //Optimized Brute force Approach TC : O(n^2)  (PREFIX SUM)
    public static int OBF(int[] arr,int n){

        int count = 0;
        for(int i = 0 ; i < n ; i++){
            int sum = 0;
            for(int j = i; j < n ; j++) {
                sum += arr[j] == 0 ? -1 : 1;
                if(sum == 0) count++;
            }
        }
        return count;
    }

    //Most Optimized Approach TC : O(N) (PREFIX SUM + HASHMAP)
    public static int OP(int[] arr,int n){



        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0, sum = 0;

        for(int i = 0 ; i < n; i++){
            sum += (arr[i] == 0) ? -1 : 1;
            if(map.containsKey(sum)) count += map.get(sum);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,1};
        int n = arr.length;
        System.out.println(BF(arr,n));
        System.out.println(OBF(arr,n));
        System.out.println(OP(arr,n));
    }

}

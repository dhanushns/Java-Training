package JPQP;

import java.util.*;
public class LargestSumCycle {

    public static int[] findCycle(int[] e, int pos, boolean[] visited){

        int start = pos;
        int current = pos;
        int size = 0;
        int sum = 0;

        ArrayList<Integer> cycle = new ArrayList<>();

        while(e[current] != -1 && !cycle.contains(current)){
            visited[current] = true;
            size++;
            sum += current;
            cycle.add(current);
            current = e[current];
        }

        if(current == start)
            return new int[] {sum,size};
        return new int[] {0,0};
    }

    public static void main(String[] args) {

        int n = 10;
        //int[] edges = new int[] {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        int[] edges = new int[] {8,6,5,8,8,8,8,3,7,3};
        boolean[] visited = new boolean[n];
        int maxSum = 0, maxCyleSize = 0;

        for(int i = 0 ; i < n ; i++){
                int[] arr = findCycle(edges,i,visited);
                if(arr[1] != 0){
                    if(arr[0] > maxSum){
                        maxSum = arr[0];
                        maxCyleSize = arr[1];
                    }
                }
        }
        System.out.println(maxSum);
    }

}

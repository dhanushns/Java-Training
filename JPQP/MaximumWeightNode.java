package JPQP;

import java.util.Arrays;

public class MaximumWeightNode {

    //Not optimized takes more time because nested for loop iterates over n time for every ith value;
    public static int findMaxWeight(int[] e, int n){

        int maxSum = 0;
        int maxNode = 0;
        for(int i  = 0 ; i < n; i++){

            int currentNode = i;
            int sum = 0;

            for(int j = 0 ; j < n ; j++){

                if(e[j] == i)
                    sum += j;
            }

            if(sum > maxSum) {
                maxSum = sum;
                maxNode = currentNode;
            }
            else if(sum == maxSum){
                if(currentNode > maxNode)
                    maxNode = currentNode;
            }

        }
        return maxNode;
    }

    //Efficient Method
    public static void maximumWeightNode(int[] edges,int n,int[] weights){

        for(int i = 0 ; i < n; i++){

            if(edges[i] != -1)
                weights[edges[i]] += i;
        }

    }

    public static void main(String[] args) {

        int n = 23;
        int[] edges = new int[] {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        System.out.println(findMaxWeight(edges,n));
        int[] weights = new int[n];
        maximumWeightNode(edges,n,weights);
        int maxWeight= 0;
        int node = 0;
        for(int i = 0; i < n ; i++){
            if(weights[i] > maxWeight) {
                maxWeight = weights[i];
                node = i;
            }
        }
        System.out.println(node);
    }

}

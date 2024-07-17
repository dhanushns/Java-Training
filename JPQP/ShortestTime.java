package JPQP;

import java.util.*;

public class ShortestTime {

    public static void findWeights(int[] weights,ArrayList[] graph){

        for(int i = 0 ; i < weights.length; i++){
            for(int j = 0 ; j < graph[i].size(); j++){
                if((Integer) graph[i].get(j) != -1){
                    int node = (Integer) graph[i].get(j);
                    weights[node] += i;
                }
            }
        }
    }

    static int minTime = Integer.MAX_VALUE;
    static int minimumTime(ArrayList[] graph, int[] weights,int currentEdge, int destination,int time){

        //positive base case
        if(currentEdge == destination){
            return time;
        }

        for(int i = 0 ; i < graph[currentEdge].size(); i++){
            time += weights[currentEdge];
            int t = minimumTime(graph,weights,(Integer) graph[currentEdge].get(i),destination,time);
            if(t < minTime)
                minTime = t;
        }
        return minTime;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = 6;
        ArrayList[] graph = new ArrayList[n];
        for(int i  = 0 ; i < n ;i++)
            graph[i] = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i++){
            String[] s = input.nextLine().split(" ");
            for(int j = 0 ; j < s.length; j++) {

                graph[i].add((Integer.parseInt(s[j])));

            }
        }

        int[] weights = new int[n];
        findWeights(weights,graph);
        System.out.println(minimumTime(graph,weights,2,5,0));
    }

}

package JPQP;

import java.util.*;
public class MaximumWeightCycle {

    static int largestWeightSum = Integer.MIN_VALUE;
    public static int getMaxWeightCycle(int startNode, int currentNode,int weightSum,WeightedUndirectedGraph graph,boolean[] nodeVisited){

        nodeVisited[currentNode] = true;

        for(HashMap<Integer,Integer> map : graph.nodes.get(currentNode)){
            for(int k : map.keySet()) {
                if (!nodeVisited[k]) {
                    int currentWeight = getMaxWeightCycle(startNode, k,weightSum + map.get(k), graph, nodeVisited);
                    if (currentWeight > largestWeightSum)
                        largestWeightSum = currentWeight;
                    nodeVisited[k] = false;
                }
                else if(k == startNode)
                    return weightSum;
            }
        }
        return largestWeightSum;
    }

    public static void main(String[] args) {

        WeightedUndirectedGraph graph = new WeightedUndirectedGraph(9);
        graph.addEdge(0,1,4);
        graph.addEdge(0,7,8);
        graph.addEdge(1,2,8);
        graph.addEdge(1,7,11);
        graph.addEdge(2,3,7);
        graph.addEdge(2,8,2);
        graph.addEdge(2,5,4);
        graph.addEdge(3,4,9);
        graph.addEdge(3,5,14);
        graph.addEdge(4,5,10);
        graph.addEdge(5,6,2);
        graph.addEdge(6,8,6);
        graph.addEdge(6,7,1);
        graph.addEdge(7,8,7);

       boolean[] visitedNodes = new boolean[9];
       for(int i = 0 ; i < 9 ; i++){
           if(!visitedNodes[i]){
               System.out.println(getMaxWeightCycle(i,i,0,graph,visitedNodes));
           }
       }

    }

}

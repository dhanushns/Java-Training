package Graphs;

import java.util.*;
public class MinimumHeightTrees_310 {

    public static int findMinHeightTrees(int root,List<List<Integer>> graph,HashSet<Integer> visitedNodes){

        if(visitedNodes.contains(root))
            return 1;

        visitedNodes.add(root);

        int height = 0;
        for(int child : graph.get(root)){
            if(!visitedNodes.contains(child)){
                height = findMinHeightTrees(child,graph,visitedNodes) + 1;
            }
        }
        return height;
    }

    public static void main(String[] args) {
        int[][] node_val = new int[][] {{1,0},{1,2},{1,3}};
        int n = 4;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i = 0 ; i < n ; i++)
            graph.add(new ArrayList<>());

        for(int[] nodes : node_val){
            graph.get(nodes[0]).add(nodes[1]);
            graph.get(nodes[1]).add(nodes[0]);
        }
        System.out.println(graph);
        HashSet<Integer> visitedNodes = new HashSet<>();
        ArrayList<Integer> minHeightTrees = new ArrayList<>();
        int minHeight = Integer.MAX_VALUE;
        for(int node = 0; node < n ; node++){
            if(graph.get(node).size() > 1){
                int currentNodeHeight = findMinHeightTrees(node,graph,visitedNodes);
                if(currentNodeHeight <= minHeight) {
                    minHeight = currentNodeHeight;
                    minHeightTrees.add(node);
                }
            }
        }
        System.out.println(minHeightTrees);
    }
}

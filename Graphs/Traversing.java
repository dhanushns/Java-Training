package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Traversing {

    public static void BFS(ArrayList<ArrayList<Integer>> graph){
        boolean[] visitedNodes = new boolean[graph.size()];
        Queue<ArrayList<Integer>> q = new LinkedList<>();
        q.add(graph.get(0));
        visitedNodes[0] = true;
        System.out.print(0 + " ");
        while (!q.isEmpty()){
            ArrayList<Integer> node = q.peek();
            for(int data : node){
                if(!visitedNodes[data]){
                    System.out.print(data + " ");
                    q.add(graph.get(data));
                    visitedNodes[data] = true;
                }
            }
            q.poll();
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> graph, int node, boolean[] visitedNode){
        if(!visitedNode[node]){
            visitedNode[node] = true;
            System.out.print(node + " ");
            for(int i = 0; i < graph.get(node).size(); i++)
                DFS(graph,graph.get(node).get(i),visitedNode);
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        Node node1 = new Node(new int[]{1,2});
        Node node2 = new Node(new int[]{0,3});
        Node node3 = new Node(new int[]{0,4});
        Node node4 = new Node(new int[]{1,4});
        Node node5 = new Node(new int[]{2,3,5});
        Node node6 = new Node(new int[]{4});
        graph.add(node1.data);
        graph.add(node2.data);
        graph.add(node3.data);
        graph.add(node4.data);
        graph.add(node5.data);
        graph.add(node6.data);
        System.out.println("Graph data : " + graph);
        System.out.print("Breath First Traversing : ");
        BFS(graph);
        System.out.print("\nDepth First Traversing : ");
        DFS(graph,0,new boolean[graph.size()]);
    }

}

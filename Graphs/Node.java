package Graphs;

import java.util.*;
public class Node {

    //Method 1
    ArrayList<Integer> data = new ArrayList<>();
    Node(){}

    Node(int[] dataItems){
        for (int dataItem : dataItems)
            this.data.add(dataItem);
    }

    //Method 2
    //Another Efficient method to sore the graph
    int val;
    List<Node> neighbors;
    Node graph;

    Node(int val){
        this.val = val;
        neighbors = new ArrayList<>();
    }

    Node(int val,ArrayList<Node> neighbors){
        this.val = val;
        this.neighbors = neighbors;
    }

    Node(HashMap<Integer, List<Integer>> node_values){
        graph = BuildGraph(1,node_values);
    }

    HashMap<Integer,Node> map = new HashMap<>();
    public Node BuildGraph(int source, HashMap<Integer,List<Integer>> node_values){

        Node node = new Node(source);
        map.put(source,node);
        for(int n : node_values.get(source)){
            if(map.containsKey(n))
                node.neighbors.add(map.get(n));
            else node.neighbors.add(BuildGraph(n,node_values));
        }

        return node;
    }

    HashMap<Node,List<Node>> dp_node = new HashMap<>();

    public void genHashMap(Node graph){
        if(graph == null)
            return;

        dp_node.put(graph,graph.neighbors);
        for(Node n : graph.neighbors)
            if(!dp_node.containsKey(n))
                genHashMap(n);
    }

    public void displayGraph(Node graph){
        genHashMap(graph);
        ArrayList<ArrayList<Integer>> graph_nodes = new ArrayList<>();
        for(Node n : dp_node.keySet()){
            ArrayList<Integer> nodes = new ArrayList<>();
            for(Node k : n.neighbors)
                nodes.add(k.val);
            graph_nodes.add(nodes);
        }
        System.out.println(graph_nodes);
    }

}

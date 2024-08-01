package Graphs;

import java.util.*;

public class CloneGraph {

    static HashMap<Node,Node> map = new HashMap<>();
    public static Node DeepClone(Node node){

        if(node == null)
            return null;

        Node clonedNodes = new Node(node.val);
        map.put(node,clonedNodes);
        for(Node n : node.neighbors){
            if(map.containsKey(n))
                clonedNodes.neighbors.add(map.get(n));
            else clonedNodes.neighbors.add(DeepClone(n));
        }
        return clonedNodes;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int no_nodes = input.nextInt();

        HashMap<Integer,List<Integer>> node_values = new HashMap<>();
        for(int node = 1; node <= no_nodes; node++){
            System.out.print("Neighbors of Node " + node + " : ");
            int x = input.nextInt();
            int y = input.nextInt();
            ArrayList<Integer> values = new ArrayList<>(List.of(x,y));
            node_values.put(node,values);
        }
        Node node = new Node(node_values);
        Node clonedNode = DeepClone(node.graph);
        clonedNode.displayGraph(clonedNode);
    }

}

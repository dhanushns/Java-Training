package Problems.Trees;

import java.util.*;
public class TreeBuilder {

    public static Node Build(String[] nodeValues){
        Queue<Node> nodes = new LinkedList<>();
        Node root = null;
        if(nodeValues[0] != null){
            root = new Node(Integer.parseInt(nodeValues[0]));
            nodes.add(root);
        }
        int pos = 1;
        while(!nodes.isEmpty()){
            int size = nodes.size();
            for(int i = 0; i < size; i++){
                Node n = nodes.poll();
                if(nodeValues[pos] != null){
                    Node leftNode = new Node(Integer.parseInt(nodeValues[pos]));
                    n.left = leftNode;
                    nodes.add(leftNode);
                }
                pos++;
                if(nodeValues[pos] != null){
                    Node rightNode = new Node(Integer.parseInt(nodeValues[pos]));
                    n.right = rightNode;
                    nodes.add(rightNode);
                }
                pos++;
                if(pos >= nodeValues.length)
                    return root;
            }
        }
        return root;
    }

}

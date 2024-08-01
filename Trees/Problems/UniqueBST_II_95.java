package Trees.Problems;

import java.util.*;

public class UniqueBST_II_95 {

    public static List<Node> BST(int left,int right){

        if(left == right)
            return new ArrayList<>(List.of(new Node(left)));

        if(left > right)
            return new ArrayList<>(List.of(new Node()));

        List<Node> res = new ArrayList<>();
        for(int node = left ; node <= right; node++){

            for(Node leftChild : BST(left,node-1)){

                for(Node rightChild : BST(node+1,right)){
                    Node root = new Node(node,leftChild,rightChild);
                    res.add(root);
                }

            }
        }
        return res;
    }

    public static List<Object> traverse(Node root,List<Object> tree){

        if(root == null)
            return null;

        if(root.data == 0)
            tree.add(null);
        else tree.add(root.data);
        traverse(root.left,tree);
        traverse(root.right,tree);
        return tree;
    }

    public static void main(String[] args) {

        int n = 3;
        List<Node> res = BST(1,n);
        List uniqueBST = new ArrayList<>();
        for(Node node : res){

            uniqueBST.add(traverse(node,new ArrayList<Object>()));
        }
        System.out.println(uniqueBST);

    }

}

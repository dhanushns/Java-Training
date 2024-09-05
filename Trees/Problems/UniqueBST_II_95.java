package Trees.Problems;

import java.util.*;

public class UniqueBST_II_95 {

    public static List<Node> BST(int left,int right){

        if(left == right)
            return new ArrayList<>(List.of(new Node(left)));

        if(left > right) {
            return new ArrayList<>(List.of(new Node(0)));
        }

        ArrayList<Node> trees = new ArrayList<>();
        for(int nodeVal = left; nodeVal <= right; nodeVal++) {
            for(Node leftChild : BST(left,nodeVal-1)) {
                for (Node rightChild : BST(nodeVal + 1, right)) {
                    Node tree;
                    if(leftChild.data == 0){
                        tree = new Node(nodeVal,null,rightChild);
                    }
                    else if(rightChild.data == 0){
                        tree = new Node(nodeVal,leftChild,null);
                    }
                    else{
                        tree = new Node(nodeVal,leftChild,rightChild);
                    }
                    trees.add(tree);
                }
            }
        }
        return trees;
    }

    public static void main(String[] args) {

        int n = 3;
        List<Node> trees = BST(1,n);
        System.out.println(trees);
    }

}

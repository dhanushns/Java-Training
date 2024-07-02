package Trees;

import java.util.*;

public class TreeBuilder {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

}

class TreeTraversal extends TreeBuilder {

    public void preorder(Node root){

        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public void inorder(Node root){
        if(root.left == null) {
            System.out.print(root.data + " ");
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void postorder(Node root){
        if(root.left == null) {
            System.out.print(root.data + " ");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public void levelorder(Node root){

        Queue<Node> queue = new LinkedList<>();
        if(root != null)
            queue.add(root);
        else{
            System.out.println("Empty Tree");
            return;
        }
        while(!queue.isEmpty()){
            Node node = queue.peek();
            if(node.left != null)
                queue.add(node.left);
            if(node.right != null)
                queue.add(node.right);
            System.out.print(queue.remove().data + " ");
        }

    }

    //*********** ZigZag Tree Traversal ************
    public void zigzag(Node root){
        ArrayList<ArrayList<Integer>> zigzagList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean controller = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                Node node = queue.peek();
                if(node != null){
                    if(node.left != null)
                        queue.add(node.left);
                    if(node.right != null)
                        queue.add(node.right);
                }
                if(controller){
                    list.add(0,queue.remove().data);
                }
                else{
                    list.add(queue.remove().data);
                }
            }
            controller = !controller;
            zigzagList.add((ArrayList<Integer>) list.clone());
            list.clear();
        }
        System.out.println();
        for(ArrayList<Integer> e1 : zigzagList){
            for(Object e2 : e1){
                System.out.print(e2 + " ");
            }
            System.out.println();
        }
    }
}

class operations extends TreeBuilder{

    int count = 0;
    boolean tree_match = true;
    public int count(Node root) {
        if (root == null) {
            return -1;
        }
        else
            count++;
        count(root.left);
        count(root.right);
        return count;
    }

    public int sumLeafNodes(Node root, int sum){
        if(root == null)
            return sum;
        if(root.left == null && root.right == null){
            sum += root.data;
            return sum;
        }
        sum = sumLeafNodes(root.left,sum);
        sum = sumLeafNodes(root.right,sum);
        return sum;
    }

    public void match(Node n1,Node n2){

        if (n1 != null && n2 != null)
        {
            if(n1.data != n2.data)
                tree_match = true;
            else {
                tree_match = false;
                return;
            }

            match(n1.left,n2.left);
            match(n1.right,n2.right);
        }

    }
}

class BinarySearchTree{

    int data;
    BinarySearchTree left;
    BinarySearchTree right;

    BinarySearchTree(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(BinarySearchTree root, int data){
        int tar = root.data;
        BinarySearchTree node = new BinarySearchTree(data);
        if(data < tar)
            root.left = node;
        else
            root.right = node;
    }

    public void build(BinarySearchTree root, int[] dataItems){
        int mid = dataItems[dataItems.length/2];
        if(root == null){
            BinarySearchTree head = new BinarySearchTree(mid);
            root = head;
        }
        else{
            BinarySearchTree node = new BinarySearchTree(mid);
            int tar = root.data;
            if(mid < tar)
                root.left = node;
            else
                root.right = node;
        }
    }

}
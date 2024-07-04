package Trees;

public class BinarySearchTreeBuilder {

    public static void main(String[] args) {

        int[] data = new int[] {10,20,30,40,50,60,70};
        BinaryTree tree = new BinaryTree();
        Node root = null;
        root = tree.build(root,data);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);
    }

}

class BinaryTree{

    public Node build(Node root,int[] dataItems){

        //Base Case
        if(dataItems.length == 0)
            return root;

        //Finding the middle element and create a new Node
        int len = dataItems.length;
        int mid = dataItems[len/2];
        Node node = new Node(mid);

        //Dividing the Array ** Left Sub Array **
        int[] left_subArr = new int[len/2];
        System.arraycopy(dataItems, 0, left_subArr, 0, len/2);
        node.left = build(node,left_subArr); //Left Recursion

        //Dividing the Array ** Right Sub Array **
        int[] right_subArr = new int[len/2];
        for(int i = len/2 + 1, j = 0 ; i < len; i++,j++)
            right_subArr[j] = dataItems[i];
        node.right = build(node,right_subArr); //Right Recursion

        // Return the new node
        return node;
    }

}

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
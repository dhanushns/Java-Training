package JPQP;

public class CheckForBST {

    public static int maxValue(Node root){

        if(root == null)
            return Integer.MAX_VALUE;

        int value = root.data;
        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(value,Math.max(leftMax,rightMax));

    }

    public static boolean isBST(Node root){

        if(root == null)
            return true;



        boolean left_check = isBST(root.left);
        boolean right_check = isBST(root.right);
        return left_check == right_check;
    }

    public static void main(String[] args) {

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        //root.left.left = new Node(1);
        //root.left.right = new Node(3);
        root.right.left = new Node(9);
        root.right.right = new Node(25);
        System.out.println(isBST(root));
    }

}

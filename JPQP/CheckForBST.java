package JPQP;

public class CheckForBST {

    public static int maxValue(Node root){

        if(root == null)
            return Integer.MIN_VALUE;

        int value = root.data;
        int leftMax = maxValue(root.left);
        int rightMax = maxValue(root.right);

        return Math.max(value,Math.max(leftMax,rightMax));

    }

    public static int minValue(Node root){

        if(root == null)
            return Integer.MAX_VALUE;

        int value = root.data;
        int leftMin = minValue(root.left);
        int rightMin = minValue(root.right);
        return Math.min(value,Math.min(leftMin,rightMin));

    }

    public static boolean isBST(Node root){

        if(root == null)
            return true;

        if(root.left != null){
            if(maxValue(root.left) >= root.data)
                return false;
        }

        if(root.right != null){
            if(minValue(root.right) <= root.data)
                return false;
        }

        return isBST(root.left) && isBST(root.right);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(6);
        //root.left.left = new Node(1);
        //root.left.right = new Node(3);
        //root.right.left = new Node(9);
        //root.right.right = new Node(25);
        System.out.println(isBST(root));
    }

}

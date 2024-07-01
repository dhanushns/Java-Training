package Trees;

public class TreeBuilder {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryTree{

        static int idx = -1;

        public static Node buildBinaryTree(int[] dataItems){
            idx++;
            if(dataItems[idx] == -1)
                return null;
            Node node = new Node(dataItems[idx]);
            node.left = buildBinaryTree(dataItems);
            node.right = buildBinaryTree(dataItems);
            return node;
        }

        public static void main(String[] args) {

            int[] dataItems = new int[] {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            BinaryTree tree = new BinaryTree();
            Node root = tree.buildBinaryTree(dataItems);
            System.out.println(root.right.data);
        }

    }

}

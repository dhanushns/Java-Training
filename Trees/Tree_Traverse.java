package Trees;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//        int[] dataItems = new int[] {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        TreeBuilder.Node root = new TreeBuilder.Node(1);
        root.left = new TreeBuilder.Node(2);
        root.right = new TreeBuilder.Node(3);
        root.left.left = new TreeBuilder.Node(4);
        root.left.right = new TreeBuilder.Node(5);
        root.right.left = new TreeBuilder.Node(6);
        root.right.right = new TreeBuilder.Node(7);
        TreeTraversal traverse = new TreeTraversal();
        System.out.print("pre-order : ");
        traverse.preorder(root);
        System.out.print("\nIn-order : ");
        traverse.inorder(root);
        System.out.print("\nPost-order : ");
        traverse.postorder(root);
        System.out.print("\nLevel-order : ");
        traverse.levelorder(root);
        System.out.print("\nZigZag Level-order : ");
        traverse.zigzag(root);
        System.out.println("Count : " + traverse.count(root) + " nodes");
        System.out.println("Sum of Leaf nodes : " + traverse.sumLeafNodes(root,0));
    }

}
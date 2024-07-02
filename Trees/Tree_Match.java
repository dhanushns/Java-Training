package Trees;

public class Tree_Match {

    public static void main(String[] args) {

        TreeBuilder.Node tree_1 = new TreeBuilder.Node(1);
        tree_1.left = new TreeBuilder.Node(2);
        tree_1.right = new TreeBuilder.Node(3);
        tree_1.left.left = new TreeBuilder.Node(4);
        tree_1.left.right = new TreeBuilder.Node(5);
        tree_1.right.left = new TreeBuilder.Node(6);
        tree_1.right.right = new TreeBuilder.Node(7);

        TreeBuilder.Node tree_2 = new TreeBuilder.Node(1);
        tree_2.left = new TreeBuilder.Node(2);
        tree_2.right = new TreeBuilder.Node(3);
        tree_2.left.left = new TreeBuilder.Node(4);
        tree_2.left.right = new TreeBuilder.Node(5);
        tree_2.right.left = new TreeBuilder.Node(6);
        tree_2.right.right = new TreeBuilder.Node(7);

        operations tree = new operations();
        tree.match(tree_1,tree_2);
        System.out.println(tree.tree_match);

    }

}

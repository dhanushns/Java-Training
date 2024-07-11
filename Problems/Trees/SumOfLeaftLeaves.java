package Problems.Trees;

public class SumOfLeaftLeaves {

    public static int computeSum(Node root,int sum){

        if(root == null)
            return sum;
        if(root.left != null)
            if(root.left.left == null & root.right.right == null)
                sum += root.left.data;
        sum = computeSum(root.left,sum);
        sum = computeSum(root.right,sum);
        return sum;
    }

    public static void main(String[] args) {
        String[] nodeValues = {"3","9","20",null,null,"15","7"};
        TreeBuilder builder = new TreeBuilder();
        Node root = builder.Build(nodeValues);
        System.out.println(computeSum(root,0));
    }

}

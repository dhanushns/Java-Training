package Problems.Trees;

import java.awt.datatransfer.FlavorEvent;

public class DeepestLeavesSum {

    static int sum = 0, max_level = Integer.MIN_VALUE;

    public static void DFS(Node root,int level){
        if(root == null)
            return;
        if(level > max_level){
            max_level = level;
            sum = root.data;
        }
        else if(level == max_level)
            sum += root.data;
        DFS(root.left,level+1);
        DFS(root.right,level+1);
    }

    public static void main(String[] args) {
        Node root = TreeBuilder.Build(new String[] {"1","2","3","4","5",null,"6","7",null,null,null,null,"8"});
        DFS(root,0);
        System.out.println(sum);
    }

}

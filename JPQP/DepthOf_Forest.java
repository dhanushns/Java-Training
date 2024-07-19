package JPQP;

import java.util.ArrayList;

public class DepthOf_Forest {

    public static ArrayList[] constructTree(int[] nodes){

        ArrayList[] tree = new ArrayList[nodes.length];

        for(int i = 0 ; i < nodes.length; i++){
            tree[i] = new ArrayList<Integer>();
        }

        for(int i = 0 ; i < nodes.length; i++){

            if(nodes[i] != -1){
                tree[nodes[i]].add(i);
            }

        }

        return tree;
    }

    static int findDepth(ArrayList[] tree,int pos,int depth){

        if(tree[pos].isEmpty())
            return depth;

        for(int i = 0 ; i < tree[pos].size(); i++){
            int currentDepth = findDepth(tree, (Integer) tree[pos].get(i), depth+1);
            if(currentDepth > depth)
                return currentDepth;
        }

        return depth;
    }

    public static void main(String[] args) {

        int[] nodes = new int[] {5,-1,1,1,5,2};
        ArrayList[] tree = constructTree(nodes);
//        for(ArrayList<Integer> node : tree){
//            System.out.println(node);
//        }

        int rootNode = 0;
        for(int i = 0 ; i < nodes.length; i++)
            if(nodes[i] == -1)
                System.out.println(findDepth(tree,i,0));
    }

}

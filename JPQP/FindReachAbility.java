package JPQP;

public class FindReachAbility {

    public static boolean isAbleToReach(int[] edges,int sourceNode, int currentNode,int destinationNode){

        //positive base case
        if(currentNode == destinationNode)
            return true;

        //Negative Base case
        if(currentNode == sourceNode)
            return false;
        if(currentNode == -1)
            return false;

        return isAbleToReach(edges,sourceNode,edges[currentNode],destinationNode);

    }

    public static void main(String[] args) {

        int n = 23;
        int[] edges = new int[] {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        //int[] edges = new int[] {8,6,5,8,8,8,8,3,7,3};
        boolean[] visited = new boolean[n];
        int sourceNode = 5, destinationNode = 9;
        System.out.println(isAbleToReach(edges,sourceNode,edges[sourceNode],destinationNode));

    }

}

package JPQP;

public class NearestMeetingCell {

    public static int findNearestCell(int[] edges, int n1,int n2,int node1, int node2,boolean[] visitedNode){

        //positive base case
        if(visitedNode[node1] && node1 != n2)
            return node1;
        if(visitedNode[node2] && node2 != n1)
            return node2;

        if(node1 == node2)
            return node1;

        visitedNode[node1] = true;
        visitedNode[node2] = true;

        return findNearestCell(edges,n1,n2,edges[node1],edges[node2],visitedNode);

    }

    public static void main(String[] args) {

        int n = 23;
        int[] edges = new int[] {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        //int[] edges = new int[] {8,6,5,8,8,8,8,3,7,3};
        boolean[] visited = new boolean[n];

        int node1 = 8, node2 = 11;
        System.out.println(findNearestCell(edges,node1,node2,node1,node2,visited));
    }

}

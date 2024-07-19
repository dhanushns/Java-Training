package JPQP;

import java.util.*;

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

    //React Developers Community Question
    static boolean reachable = false;
    public static boolean isAbleToCommunicate(HashMap<Integer, ArrayList<Integer>> graph, int source,int destination,Set<Integer> visited){

        visited.add(source);
        //positive base case
        if(source == destination) {
            return true;
        }

        //negative base case
        if(!graph.containsKey(source))
            return false;

        for(int neighbor : graph.get(source)){
            if(!visited.contains(neighbor)){
                boolean isReachable = isAbleToCommunicate(graph,neighbor,destination,visited);
                return isReachable;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int n = 23;
        int[] edges = new int[] {4,4,1,4,13,8,8,8,0,8,14,9,15,11,-1,10,15,22,22,22,22,22,21};
        //int[] edges = new int[] {8,6,5,8,8,8,8,3,7,3};
        boolean[] visited = new boolean[n];
        int sourceNode = 5, destinationNode = 9;
        System.out.println(isAbleToReach(edges,sourceNode,edges[sourceNode],destinationNode));

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int[] nodes = new int[N];
        for(int i = 0; i < N; i++)
            nodes[i] = input.nextInt();
        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        Set<Integer> visitedNodes = new HashSet<>();

        int conn = input.nextInt();
        for(int i = 0 ; i < conn ; i++){

            int x = input.nextInt();
            int y = input.nextInt();
            if(graph.containsKey(x)){
                ArrayList<Integer> child = graph.get(x);
                child.add(y);
                graph.put(x,child);
            }
            else graph.put(x,new ArrayList<>(List.of(y)));

        }

        System.out.println(graph);

        //Check the reachability
        System.out.println(isAbleToCommunicate(graph,2,9, visitedNodes));

    }

}

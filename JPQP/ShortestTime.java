package JPQP;

import java.util.*;

public class ShortestTime {

    public static void findWeights(int[] weights,ArrayList[] graph){

        for(int i = 0 ; i < weights.length; i++){
            for(int j = 0 ; j < graph[i].size(); j++){
                if((Integer) graph[i].get(j) != -1){
                    int node = (Integer) graph[i].get(j);
                    weights[node] += i;
                }
            }
        }
    }

    static int minTime = Integer.MAX_VALUE;
    static int minimumTime(ArrayList[] graph, int[] weights,int currentEdge, int destination,int time){

        //positive base case
        if(currentEdge == destination){
            return time;
        }

        for(int i = 0 ; i < graph[currentEdge].size(); i++){
            time += weights[currentEdge];
            int t = minimumTime(graph,weights,(Integer) graph[currentEdge].get(i),destination,time);
            if(t < minTime)
                minTime = t;
        }
        return minTime;
    }


    static int SHORTEST_TIME = Integer.MAX_VALUE;
    public static int shortestTime(HashMap<Integer, ArrayList<HashMap<Integer,Integer>>> graph, int source, int destination, int time, HashSet<Integer> visitedNodes) {


        if (source == destination)
            return time;
        else visitedNodes.add(source);

        if (!graph.containsKey(source))
            return Integer.MAX_VALUE;

        for (HashMap map : graph.get(source)) {
            for (Object node : map.keySet()) {
                if(!visitedNodes.contains((Integer)node)){
                    int t = shortestTime(graph, (Integer) node, destination, time + (Integer) map.get(node),visitedNodes);
                    if (t < SHORTEST_TIME) {
                        SHORTEST_TIME  = t;
                    }
                }
            }
        }
        visitedNodes.remove(source);
        return SHORTEST_TIME;
    }

    //Function to find the shortest time to send message
    public static void getShortestTime(){
//        Scanner input = new Scanner(System.in);
        int n = 7;
        int[] nodes = {2,5,7,9,4};
//        for(int i = 0 ; i < n ;i++)
//            nodes[i] = input.nextInt();
//        int conn = input.nextInt();
        WeightedDirectedGraph graph = new WeightedDirectedGraph(n);
        HashSet<Integer> visitedNodes = new HashSet<>();
        graph.addEdge(0,1,2);
        graph.addEdge(0,5,3);
        graph.addEdge(1,9,11);
        graph.addEdge(1,8,2);
        graph.addEdge(1,0,2);
        graph.addEdge(8,0,6);
        graph.addEdge(8,7,9);
        graph.addEdge(9,8,5);
        graph.addEdge(9,0,9);
        graph.addEdge(7,9,8);
        graph.addEdge(7,5,2);
        graph.addEdge(6,5,1);
        graph.addEdge(6,7,1);
        graph.addEdge(5,1,3);
        graph.addEdge(5,6,4);
        HashMap node = graph.graph;

        System.out.println(shortestTime(node,9,7,0,visitedNodes));
    }

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        int n = 6;
//        ArrayList[] graph = new ArrayList[n];
//        for(int i  = 0 ; i < n ;i++)
//            graph[i] = new ArrayList<Integer>();
//        for(int i = 0 ; i < n ; i++){
//            String[] s = input.nextLine().split(" ");
//            for(int j = 0 ; j < s.length; j++) {
//
//                graph[i].add((Integer.parseInt(s[j])));
//
//            }
//        }

//        int[] weights = new int[n];
//        findWeights(weights,graph);
//        System.out.println(minimumTime(graph,weights,2,5,0));

        getShortestTime();
    }

}

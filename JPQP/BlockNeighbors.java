package JPQP;

import java.util.*;
public class BlockNeighbors {

    //BFS Method
    public static ArrayList<Integer> block(HashMap<Integer,ArrayList<Integer>> graph, int source, int target){

        Queue<Integer> nodes = new LinkedList<>();
        HashSet<Integer> visitedNodes = new HashSet<>();
        ArrayList<Integer> blockedList = new ArrayList<>();
        for(int n : graph.get(source)) {
            if(n == target)
                blockedList.add(source);
            else nodes.add(n);
        }

        while(!nodes.isEmpty()){

            int size = nodes.size();
            for(int i = 0 ; i < size; i++){

                int n = nodes.poll();
                if(!visitedNodes.contains(n)){
                    for(int k : graph.get(n)){
                        if(k == target)
                            blockedList.add(0,n);
                        else nodes.add(k);
                    }
                    visitedNodes.add(n);
                }

            }

        }
        return blockedList;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        int  n = input.nextInt();

        HashMap<Integer, ArrayList<Integer>> graph = new HashMap<>();
        graph.put(2,new ArrayList<>(List.of(6)));
        graph.put(5,new ArrayList<>(List.of(2)));
        graph.put(7,new ArrayList<>(List.of(5)));
        graph.put(9,new ArrayList<>(List.of(7)));
        System.out.println(block(graph,9,6));
    }

}

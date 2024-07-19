package JPQP;

import java.util.*;

public class WeightedDirectedGraph {

    int v;
    HashMap<Integer,ArrayList<HashMap<Integer,Integer>>> graph;

    WeightedDirectedGraph(int v){
        this.v = v;
        this.graph = new HashMap<>();
    }

    public void addEdge(int u,int v,int w){

        if(graph.containsKey(u)){
            graph.get(u).add(new HashMap<>());
            graph.get(u).get(graph.get(u).size()-1).put(v,w);
        }
        else {
            graph.put(u,new ArrayList<>());
            ArrayList node = graph.get(u);
            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(v,w);
            node.add(map);
            graph.put(u,node);
        }
    }


}

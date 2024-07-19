package JPQP;

import java.util.*;

public class WeightedUndirectedGraph {

    int v;
    ArrayList<ArrayList<HashMap<Integer,Integer>>> graph;

    public WeightedUndirectedGraph(int v){

        this.v = v;
        this.graph = new ArrayList<>();

        for(int i = 0 ; i < v ; i++)
            graph.add(new ArrayList<>());

    }

    public void addEdge(int u,int v,int w){
        this.graph.get(u).add(new HashMap<>());
        this.graph.get(u).get(this.graph.get(u).size()-1).put(v,w);
        this.graph.get(v).add(new HashMap<>());
        this.graph.get(v)
                .get(this.graph.get(v).size() - 1)
                .put(u, w);
        System.out.println(graph);
    }

}

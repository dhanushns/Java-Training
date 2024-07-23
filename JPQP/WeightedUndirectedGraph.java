package JPQP;

import java.util.*;

public class WeightedUndirectedGraph {

    int v;
    ArrayList<ArrayList<HashMap<Integer,Integer>>> nodes;

    public WeightedUndirectedGraph(int v){

        this.v = v;
        this.nodes = new ArrayList<>();

        for(int i = 0 ; i < v ; i++)
            nodes.add(new ArrayList<>());

    }

    public void addEdge(int u,int v,int w){
        this.nodes.get(u).add(new HashMap<>());
        this.nodes.get(u).get(this.nodes.get(u).size()-1).put(v,w);
        this.nodes.get(v).add(new HashMap<>());
        this.nodes.get(v).get(this.nodes.get(v).size() - 1).put(u, w);
    }

}

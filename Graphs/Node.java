package Graphs;

import java.util.*;
public class Node {
    ArrayList<Integer> data = new ArrayList<>();

    Node(){}

    Node(int[] dataItems){
        for (int dataItem : dataItems)
            this.data.add(dataItem);
    }

}

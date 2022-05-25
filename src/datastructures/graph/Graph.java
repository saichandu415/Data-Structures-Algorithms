package datastructures.graph;

import java.util.*;

public class Graph {
    int numberOfNodes;
    Hashtable<Integer, ArrayList<Integer>> adjacentList = new Hashtable<>();

    public void addVertex(int value){
        adjacentList.put(value, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(int node1, int node2){
        adjacentList.get(node1).add(node2);
        adjacentList.get(node2).add(node1);
    }

    public void showConnections(){

        for (Integer integer : adjacentList.keySet()) {
            System.out.println(integer + "\t-->\t" + adjacentList.get(integer));
        }
    }
}

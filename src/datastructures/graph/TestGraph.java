package datastructures.graph;

public class TestGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(5);
        graph.addVertex(54);
        graph.addVertex(44);
        graph.addEdge(5,54);
        graph.addEdge(5,44);
        graph.showConnections();
    }
}

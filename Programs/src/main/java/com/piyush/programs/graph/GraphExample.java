package com.piyush.programs.graph;


import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class GraphExample {
    private Map<Vertex,List<Vertex>> adjVertices;
    void addVertex(String label){
        adjVertices.putIfAbsent(new Vertex(label),new ArrayList<>());
    }

    void removeVertex(String label){
        Vertex v=new Vertex(label);
        adjVertices.remove(v);
        adjVertices.values().stream().forEach(e->e.remove(v));
    }

    void addEdge(String label1,String label2){
        Vertex v1=new Vertex(label1);
        Vertex v2=new Vertex(label2);
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    void removeEdge(String label1, String label2) {
        Vertex v1 = new Vertex(label1);
        Vertex v2 = new Vertex(label2);
        List<Vertex> eV1 = adjVertices.get(v1);
        List<Vertex> eV2 = adjVertices.get(v2);
        if (eV1 != null)
            eV1.remove(v2);
        if (eV2 != null)
            eV2.remove(v1);
    }

    List<Vertex> getAdjVertices(String label) {
        return adjVertices.get(new Vertex(label));
    }

    public static void main(String[] args){
        GraphExample graph = new GraphExample();
        graph.addVertex("Bob");
        graph.addVertex("Alice");
        graph.addVertex("Mark");
        graph.addVertex("Rob");
        graph.addVertex("Maria");
        graph.addEdge("Bob", "Alice");
        graph.addEdge("Bob", "Rob");
        graph.addEdge("Alice", "Mark");
        graph.addEdge("Rob", "Mark");
        graph.addEdge("Alice", "Maria");
        graph.addEdge("Rob", "Maria");
    }

    Set<String> depthTraversal(String label,GraphExample graph){
        Set<String> visited = new LinkedHashSet<String>();
        Stack<String> stack = new Stack<String>();
        stack.push(label);
        while (!stack.isEmpty()) {
            String vertex = stack.pop();
            if (!visited.contains(vertex)) {
                visited.add(vertex);
                for (Vertex v : graph.getAdjVertices(vertex)) {
                    stack.push(v.label);
                }
            }
        }
        return visited;
    }
}

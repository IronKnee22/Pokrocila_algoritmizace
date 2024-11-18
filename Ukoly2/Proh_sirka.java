package Ukoly2;

import java.util.*;

public class Proh_sirka {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    public void addEdge(int source, int destination) {
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        graph.computeIfAbsent(destination, k -> new ArrayList<>()); 
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll(); 
            System.out.println("Visited node: " + node);

            for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        Proh_sirka bfs = new Proh_sirka();

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(1, 4);
        bfs.addEdge(2, 5);
        bfs.addEdge(2, 6);

        System.out.println("BFS:");
        bfs.bfs(0);
    }
}


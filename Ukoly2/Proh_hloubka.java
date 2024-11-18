package Ukoly2;
import java.util.*;



public class Proh_hloubka {
    
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    
    public void addEdge(int source, int destination) {
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        graph.computeIfAbsent(destination, k -> new ArrayList<>()); 
    }

    
    public void dfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                System.out.println("Visited node: " + node);

                for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Proh_hloubka dfs = new Proh_hloubka();

        
        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(2, 6);

        System.out.println("DFS:");
        dfs.dfs(0);
    }
}

    
    


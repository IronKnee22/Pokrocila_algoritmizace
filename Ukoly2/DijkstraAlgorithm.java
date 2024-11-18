package Ukoly2;

import java.util.*;

public class DijkstraAlgorithm {

    public static void performDijkstra(int[][] adjMatrix, int start) {
        int n = adjMatrix.length; // Počet uzlů
        int[] distances = new int[n]; // Vzdálenosti od startu
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0; // Vzdálenost od startu k sobě samému je 0

        boolean[] visited = new boolean[n]; // Uzly, které jsme již zpracovali
        int[] previous = new int[n]; // Pro uložení cesty
        Arrays.fill(previous, -1); // -1 znamená, že cesta neexistuje

        // Prioritní fronta pro průchod grafem
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[] { start, 0 }); // Přidáme startovní uzel s počáteční vzdáleností 0

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int distance = current[1];

            if (visited[node]) continue; // Pokud je uzel již zpracován, přeskočíme ho
            visited[node] = true;

            // Pro všechny sousedy aktuálního uzlu
            for (int neighbor = 0; neighbor < n; neighbor++) {
                if (adjMatrix[node][neighbor] > 0) { // Pokud existuje hrana mezi node a neighbor
                    int newDist = distance + adjMatrix[node][neighbor];
                    if (newDist < distances[neighbor]) {
                        distances[neighbor] = newDist;
                        previous[neighbor] = node;
                        pq.add(new int[] { neighbor, newDist });
                    }
                }
            }
        }

        // Najít nejvzdálenější uzel
        int farthestNode = -1;
        int maxDistance = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (distances[i] != Integer.MAX_VALUE && distances[i] > maxDistance) {
                maxDistance = distances[i];
                farthestNode = i;
            }
        }

        // Získat cestu k nejvzdálenějšímu uzlu
        List<Integer> path = new ArrayList<>();
        for (int at = farthestNode; at != -1; at = previous[at]) {
            path.add(at);
        }

        // Výstup
        System.out.println("Farthest node: " + farthestNode + ", distance: " + maxDistance);
        System.out.print("Path (reverse order): ");
        for (int i = 0; i <= path.size() - 1; i++) {
            System.out.print(path.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        int[][] adjMatrix = new int[][] {
            { 0, 1, 0, 0, 20, 0 },
            { 1, 0, 1, 0, 1, 0 },
            { 0, 1, 0, 1, 0, 0 },
            { 0, 0, 1, 0, 1, 10 },
            { 20, 1, 0, 10, 0, 0 },
            { 0, 0, 0, 1, 0, 0 }
        };
        performDijkstra(adjMatrix, 0);
    }
}

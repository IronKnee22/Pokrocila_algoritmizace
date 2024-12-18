package Semestral;

import java.util.*;

public class ManagementSystem {
    private List<Connection> connections;

    public ManagementSystem() {
        this.connections = new ArrayList<>();
    }

    public void addConnection(Connection connection) {
        connections.add(connection);
    }

    public void performDijkstra(Station source) {
        PriorityQueue<Station> queue = new PriorityQueue<>(Comparator.comparingInt(Station::getDijkstraDistance));
        source.setTime(0);
        source.setCost(0);
        queue.add(source);

        while (!queue.isEmpty()) {
            Station current = queue.poll();

            for (Connection connection : connections) {
                if (connection.getSource().equals(current)) {
                    Station neighbor = connection.getDestination();
                    int newTime = current.getDijkstraDistance() + connection.getTime();
                    int newCost = current.getCost() + connection.getCost();

                    if (newTime < neighbor.getDijkstraDistance()) {
                        neighbor.setTime(newTime);
                        neighbor.setCost(newCost);
                        neighbor.setPrevious(current);
                        queue.add(neighbor);
                    } else if (newTime == neighbor.getDijkstraDistance() && newCost < neighbor.getCost()) {
                        neighbor.setCost(newCost);
                        neighbor.setPrevious(current);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    public void printFastestPath(Station destination, Station source) {
        List<Station> path = new ArrayList<>();
        for (Station at = destination; at != null; at = at.getPrevious()) {
            path.add(at);
        }
        Collections.reverse(path);

        if (path.get(0).equals(source)) {
            path.forEach(station -> System.out.println(station.getName()));
        } else {
            System.out.println("No path found");
        }
    }

    public void printCheapestPath(Station destination, Station source) {
        
        for (Connection connection : connections) {
            connection.getSource().setCost(Integer.MAX_VALUE);
            connection.getDestination().setCost(Integer.MAX_VALUE);
        }
        source.setCost(0); 
        source.setPrevious(null); 
        PriorityQueue<Station> queue = new PriorityQueue<>(Comparator.comparingInt(Station::getCost));
        queue.add(source);
    
        while (!queue.isEmpty()) {
            Station current = queue.poll();

            for (Connection connection : connections) {
                if (connection.getSource().equals(current)) {
                    Station neighbor = connection.getDestination();
                    int newCost = current.getCost() + connection.getCost();
    
                    if (newCost < neighbor.getCost()) {
                        neighbor.setCost(newCost);
                        neighbor.setPrevious(current);
                        queue.add(neighbor);
                    }
                }
            }
        }
    
        List<Station> path = new ArrayList<>();
        for (Station at = destination; at != null; at = at.getPrevious()) {
            path.add(at);
        }
        Collections.reverse(path);
    
        if (path.get(0).equals(source)) {
            System.out.println("Cheapest Path:");
            for (Station station : path) {
                System.out.println(station.getName());
            }
            System.out.println("Total cost: " + destination.getCost());
        } else {
            System.out.println("No cheapest path found");
        }
    }
    

}

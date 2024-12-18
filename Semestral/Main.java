package Semestral;

public class Main {
    public static void main(String[] args) {

        Station london = new Station("London");
        Station manchester = new Station("Manchester");
        Station oxford = new Station("Oxford");
        Station cambridge = new Station("Cambridge");
        Station birmingham = new Station("Birmingham");
        Station bristol = new Station("Bristol");
        Station leeds = new Station("Leeds");

        ManagementSystem ms = new ManagementSystem();

        ms.addConnection(new Connection(london, manchester, 120, 100));
        ms.addConnection(new Connection(london, oxford, 60, 10));
        ms.addConnection(new Connection(oxford, london, 60, 10));
        ms.addConnection(new Connection(london, cambridge, 100, 5));
        ms.addConnection(new Connection(manchester, london, 60, 100));
        ms.addConnection(new Connection(manchester, birmingham, 180, 200));
        ms.addConnection(new Connection(birmingham, manchester, 180, 1));
        ms.addConnection(new Connection(cambridge, birmingham, 600, 5));
        ms.addConnection(new Connection(bristol, leeds, 120, 10));
        ms.addConnection(new Connection(leeds, bristol, 120, 10));
        ms.addConnection(new Connection(oxford, leeds, 60, 10));
        
        ms.performDijkstra(london);

        System.out.println(birmingham.getPreviousForDistance());
        System.out.println();
        ms.printFastestPath(birmingham, london);
        System.out.println("===");
        ms.printCheapestPath(birmingham, london);
        System.out.println("====");
        System.out.println("time (London => Birmingham): " + birmingham.getDijkstraDistance());
        System.out.println("price (London => Birmingham): " + birmingham.getCost());
    }
}

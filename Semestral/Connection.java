package Semestral;

public class Connection {
    private Station source;
    private Station destination;
    private int time;
    private int cost;

    public Connection(Station source, Station destination, int time, int cost) {
        this.source = source;
        this.destination = destination;
        this.time = time;
        this.cost = cost;
    }

    public Station getSource() {
        return source;
    }

    public Station getDestination() {
        return destination;
    }

    public int getTime() {
        return time;
    }

    public int getCost() {
        return cost;
    }
}

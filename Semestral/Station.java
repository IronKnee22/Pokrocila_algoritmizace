package Semestral;

public class Station {
    private String name;
    private int cost;
    private int time;
    private Station previous;

    public Station(String name) {
        this.name = name;
        this.cost = Integer.MAX_VALUE; // Initially set to infinity
        this.time = Integer.MAX_VALUE; // Initially set to infinity
        this.previous = null;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }
  

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDijkstraDistance() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Station getPrevious() {
        return previous;
    }

    public String getPreviousForDistance() {
        return previous.name;
    }

    public void setPrevious(Station previous) {
        this.previous = previous;
    }
}


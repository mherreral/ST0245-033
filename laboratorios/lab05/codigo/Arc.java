package Laboratorio_5;

import java.util.Objects;

public class Arc {
    private Vertex source, destination;
    private Double distance;
    private String name;

    Arc(Vertex source, Vertex destination, Double distance, String name) {
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.name = name;
    }

    Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    Vertex getDestination() {
        return destination;
    }

    public void setDestination(Vertex destination) {
        this.destination = destination;
    }

    Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    private String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Arc)) return false;
        Arc arc = (Arc) o;
        return getSource().equals(arc.getSource()) &&
                getDestination().equals(arc.getDestination()) &&
                getDistance().equals(arc.getDistance()) &&
                getName().equals(arc.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSource(), getDestination(), getDistance(), getName());
    }

    @Override
    public String toString() {
        return "Arc{" +
                "source=" + source +
                ", destination=" + destination +
                ", distance=" + distance +
                ", name='" + name + '\'' +
                '}';
    }
}

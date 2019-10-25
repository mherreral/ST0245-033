package Laboratorio_5;

import java.util.Objects;

public class Vertex {
    private Integer id;
    private Double x;
    private Double y;
    private String name;

    Vertex(Integer id, Double x, Double y, String name) {
        this.id = id;
        this.x = x;
        this.y = y;
        this.name = name;
    }

    Integer getId() {
        return id;
    }

    private Double getX() {
        return x;
    }

    private Double getY() {
        return y;
    }

    private String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vertex)) return false;
        Vertex vertex = (Vertex) o;
        return getId().equals(vertex.getId()) &&
                getX().equals(vertex.getX()) &&
                getY().equals(vertex.getY()) &&
                getName().equals(vertex.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getX(), getY(), getName());
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}

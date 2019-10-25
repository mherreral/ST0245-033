package Laboratorio_5;

import java.util.ArrayList;

/**
 * Abstract class for implementations of Digraphs
 *
 * @author Mauricio Toro
 * @version 1
 */
public abstract class Graph {
    private long size;

    Graph(long vertices) {
        size = vertices;
    }

    public abstract void addArc(Arc arc);

    public abstract ArrayList<Integer> getSuccessors(Vertex vertex);

    public abstract Double getWeight(Vertex source, Vertex destination);

    long size() {
        return size;
    }
}

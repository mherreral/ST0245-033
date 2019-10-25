package Laboratorio_5;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Esta clase es una implementación de un digrafo usando listas de adyacencia
 *
 * @author Mauricio Toro
 * @version 1
 */
public class DigraphAL extends Graph {

    private ArrayList<LinkedList<Arc>> graph;

    DigraphAL(long size) {
        super(size);
        graph = new ArrayList<>();
        for (int i = 0; i < size() + 1; i++) {
            graph.add(new LinkedList<>());
        }
    }

    public void addArc(Arc arc) {
        graph.get(arc.getSource().getId()).add(arc);
    }

    public Double getWeight(Vertex source, Vertex destination) {
        Double distance = 0.0;
        for (Arc arc : graph.get(source.getId())) {
            if (arc.getDestination().getId().equals(destination.getId()))
                distance = arc.getDistance();
            break;
        }
        return distance;
    }

    public ArrayList<Integer> getSuccessors(Vertex vertex) {
        ArrayList<Integer> successors = new ArrayList<>();
        for (Arc arc : graph.get(vertex.getId())) {
            successors.add(arc.getDestination().getId());
        }
        return successors;
    }
}

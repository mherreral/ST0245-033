package Laboratorio_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class DataSet {

    public static DigraphAL readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        HashMap<Integer, Vertex> vertexHM = new HashMap<>();
        DigraphAL dal = new DigraphAL(file.length());
        Scanner dataLine = new Scanner(file);
        dataLine.nextLine();
        while (dataLine.hasNext()) {
            String line = dataLine.nextLine();
            if (line.isEmpty()) {
                dataLine.nextLine();
                while (dataLine.hasNext()) {
                    line = dataLine.nextLine();
                    String[] array = line.split(" ", 4);
                    dal.addArc(new Arc(vertexHM.get(Integer.parseInt(array[0])),
                            vertexHM.get(Integer.parseInt(array[1])),
                            Double.parseDouble(array[2]),
                            array[3]));
                }
            } else {
                String[] array = line.split(" ", 4);
                vertexHM.put(Integer.parseInt(array[0]),
                        new Vertex(Integer.parseInt(array[0]),
                                Double.parseDouble(array[1]),
                                Double.parseDouble(array[2]), array[3]));
            }
        }
        return dal;

    }

}

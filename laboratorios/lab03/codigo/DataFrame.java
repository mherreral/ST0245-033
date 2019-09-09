package Laboratorio_3;

import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

class DataFrame {

    @NotNull
    static LinkedList<Estudiante> leerfichero(String fichero) {
        LinkedList<Estudiante> lista = new LinkedList<>();
        Estudiante estudiante;
        String linea, aux = "";
        try {

            File file = new File("./src/Laboratorio_3", fichero);
            try (Scanner in = new Scanner(file)) {
                in.nextLine();

                while (in.hasNext()) {
                    in.nextLine();
                    linea = procesarLinea(in.nextLine());

                    StringTokenizer token = new StringTokenizer(linea, ",");

                    estudiante = new Estudiante();
                    // String nombre, int codigo, String codMateria, int semestre, String grupo, String descEvaluacion,
                    // int porcentaje, String descripcion, String nomMateria, float nota, float notaDefinitiva
                    estudiante.setNombre(token.nextToken());
                    if (!estudiante.getNombre().equals(aux)) {
                        aux = estudiante.getNombre();
                        estudiante.setCodigo(token.nextToken());
                        token.nextToken();
                        estudiante.setSemestre(Integer.parseInt(token.nextToken()));
                        token.nextToken();
                        token.nextToken();
                        token.nextToken();
                        token.nextToken();
                        estudiante.setCurso(token.nextToken());
                        token.nextToken();
                        estudiante.setNota(Integer.parseInt(token.nextToken()));


                        lista.addLast(estudiante);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return lista;
    }

    static void escribirFichero(@NotNull LinkedList<Estudiante> lista) {
        for (Estudiante elemento : lista) {
            System.out.println(elemento);
        }
    }

    @NotNull
    private static String procesarLinea(String linea) {

        linea = linea.replace(",,,", ",");
        linea = linea.replace(",,", ",");
        linea = linea.replace("\"", "");
        linea = linea.replace("  ", " ");
        return linea;


    }

}

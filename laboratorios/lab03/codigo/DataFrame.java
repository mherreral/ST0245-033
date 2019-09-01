package Laboratorio_3;


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * @author Samuel Palacios Bernate
 * @version 1.0
 */
public class DataFrame {

    static String nomFichero;
    static String formato = "STATION\t\t\tSTATION_NAME\t\tDATE"
            + "\t\tPRCP\t\tTAVG\t\tTMAX\t\tTMIN"
            + "\n---------------------------------"
            + "----------------------------------"
            + "----------------------------------"
            + "------------------";

    /**
     * Imprime el fichero seleccionado por consola.
     *
     * @param lista Un ArrayList de Datos.
     */
    public static void escribirFichero(ArrayList<Dato> lista) {
        System.out.println(formato);
        lista.forEach(
                (elemento) -> {
                    System.out.println(elemento);
                });
    }

    /**
     * Guarada un archivo txt como persistencia de un fichero seleccionado y
     * procesado.
     *
     * @param lista Un ArrayList de Datos.
     * @param ruta  Ruta en la cual se guardará el fichero.
     */
    public static void escribirFichero(ArrayList<Dato> lista, String ruta) {
        FileWriter fileWriter;
        PrintWriter printWriter;
        try {
            fileWriter = new FileWriter(ruta);
            printWriter = new PrintWriter(fileWriter);
            printWriter.println(formato);
            lista.forEach(
                    (elemento) -> {
// String nombre, int codigo, String codMateria, int semestre, int grupo, String descEvaluacion, int porcentaje,
// String descripcion, String nomMateria, int nota, int notaDefinitiva
                        printWriter.println(String.valueOf(
                                elemento.getNombre() + "\t\t" + elemento.getCodigo() + "\t\t"
                                        + elemento.getCodMateria() + "\t\t" + elemento.getCodMateria() + "\t\t"
                                        + elemento.getSemestre() + "\t\t" + elemento.getGrupo() + "\t\t"
                                        + elemento.getDescEvaluacion() + "\t\t" + elemento.getPorcentaje() + "\t\t"
                                        + elemento.getDescripcion() + "\t\t" + elemento.getNomMateria() + "\t\t"
                                        + elemento.getNota() + "\t\t" + elemento.getNotaDefinitiva()));
                    });
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * Lee un archivo CSV y lo procesa para su optimo manejo.
     *
     * @param nomFichero  nombre del fichero con su extención
     * @param pathFichero Ruta donde se aloja elfichero.
     * @return Retorna un ArrayList de Dato con la información del fichero.
     * @throws NumberFormatException Cuando hay algún error al convertir los
     *                               tipos de datos.
     */
    public static ArrayList<Dato> leerFichero(String nomFichero, String pathFichero) {
        ArrayList<Dato> lista = new ArrayList<>();

        Dato dato;

        try {

            File file = new File(pathFichero, nomFichero);
            try (Scanner scFichero = new Scanner(file)) {
                String linea = scFichero.nextLine();

                while (scFichero.hasNext()) {
                    linea = procesarCadena(scFichero.nextLine());

                    StringTokenizer token = new StringTokenizer(linea, ",");

                    dato = new Dato();
                    // String nombre, int codigo, String codMateria, int semestre, String grupo, String descEvaluacion,
                    // int porcentaje, String descripcion, String nomMateria, float nota, float notaDefinitiva
                    dato.setNombre(token.nextToken());
                    dato.setCodigo(Integer.parseInt(token.nextToken()));
                    dato.setCodMateria(token.nextToken());
                    dato.setSemestre(Integer.parseInt(token.nextToken()));
                    dato.setGrupo(Integer.parseInt(token.nextToken()));
                    dato.setDescEvaluacion(token.nextToken());
                    dato.setPorcentaje(Integer.parseInt(token.nextToken()));
                    dato.setDescripcion(token.nextToken());
                    dato.setNomMateria(token.nextToken());
                    dato.setNota(Integer.parseInt(token.nextToken()));
                    dato.setNotaDefinitiva(Integer.parseInt(token.nextToken()));

                    lista.add(dato);
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

    /**
     * Procesa las cadenas del fichero CSV para que sean más fáciles de
     * manipular.
     *
     * @param cadena Una cadena de texto.
     * @return Una cadena de texto procesada y optimizada.
     */
    public static String procesarCadena(String cadena) {

        cadena = cadena.replace(",,,", ",");
        cadena = cadena.replace(",,", ",");
        cadena = cadena.replace("\"", "");
        // cadena = cadena.replace("-", "");
        cadena = cadena.replace("  ", " ");

        return cadena;
    }

}

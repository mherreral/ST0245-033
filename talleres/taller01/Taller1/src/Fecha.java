/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cl18310
 */
public class Fecha {
    /*
     varibales con atributo final indican que una variable es de tipo 
     constante, es decir, no admitirá cambios después de su declaración y asignación de valor.
     final determina que un atributo no puede ser sobreescrito o redefinido.
     Se le asigna esta característica para evitar que se sobrescriban valores.
     tener en cuenta tipado de las 3 variables!.
     */

    private final int dia;
    private final int mes;
    private final int anyo;

    /**
     * Se inicializan las variables globales en el constructor de manera que no
     * posean valores nulos o 0s.
     */
    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    /**
     * Método para obtener la variable global dia.
     *
     * @return el dia
     */
    public int dia() {
        return dia;
    }

    /**
     * Método para obtener la variable global mes.
     *
     * @return el mes
     */
    public int mes() {
        return mes;
    }

    /**
     * Método para obtener la variable global anio.
     *
     * @return el año
     */
    public int anio() {
        return anyo;
    }

    /**
     * @param otra representa la fecha con la culase va a comparar.
     *
     * El método comprar se encarga de devolvernos respuesta a tres
     * posibilidades. 1: si la fecha es menor que la otra retorna -1. 2: si la
     * fecha es igual que la otra retorna 0. 3: si la fecha es mayor que la otra
     * retorna 1.
     *
     * @return -1 sí es menor; 0 sí es igual; 1 sí es mayor.
     *
     */
    public int comparar(Fecha otra) {

        if (anyo < otra.anio()) {
            return -1;
        } else if (anyo > otra.anio()) {
            return 1;
        } else if (anyo == otra.anio()) {
            if (mes > otra.mes()) {
                return 1;
            } else if (mes < otra.mes()) {
                return -1;
            } else if (dia > otra.dia()) {
                return 1;
            } else if (dia < otra.dia()) {
                return -1;
            }
        }
        return 0;

    }

    /**
     * toString se encargará de convertir el tipo abstracto fecha en un tipo
     * cadena para su posterior visualización
     *
     * @return una cadena que contiene la fecha
     */
    public String toString() {
        return dia + "/" + mes + "/" + anyo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cl18310
 */
public class Contador {

    private int cuenta;
    private final String id;

    /**
     * Se inicializan las variables globales en el constructor de manera que no
     * posean valores nulos o 0s.
     */
    public Contador(String id) {
        this.id = id;
        cuenta = 0;
    }

    /**
     * El método incrementar incrementa el contador en una unidad.
     *
     * (opcional: se podria pasar un parametro "cantidad" para incrementar esa
     * cantidad de unidades).
     */
    public void incrementar() {
        cuenta++;
    }

    /*
     Se podría implementar un metodo decrementar para hacer la operacion inversa de incrementar.
     */
    /**
     * El método incrementos nos muestra en que valor se encuentra la cuenta
     * actualmente.
     *
     * @return el numero actual de la cuenta
     */
    public int incrementos() {
        return cuenta;
    }

    /**
     * toString se encargará de convertir el contador en un tipo cadena para su
     * posterior visualización se debe de mostrar el estado del contador y su id
     *
     * @return una cadena que contiene el id del contador y su cuenta
     */
    public String toString() {
        return id + " = " + cuenta;
    }
}

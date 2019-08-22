package Taller_6;

import java.util.Arrays;

/**
 * La clase MiArrayList tiene la intención de representar un objeto que simule el comportamiento
 * de la clase ya implementada "ArrayList"
 * es claro que no se puede utilizar dicha estructura ya utilizada dentro de este ejercicio.
 * Para más información de la clase ArrayList:
 *
 * @author Mauricio Toro, Andres Paez
 * @version 1
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html"> Ver documentacion ArrayList </a>
 */
public class MiArrayList {

    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private int elements[];

    /**
     * El metodo constructor se utiliza para incializar
     * variables a valores neutros como 0 o null.
     * El contructor no lleva parámetros en este caso.
     */
    public MiArrayList() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }


    /**
     * Tiene la intención de retornar la longitud del objeto
     *
     * @return longitud del objeto
     * <p>
     * El size esta influenciado por las funciones add y del
     */
    public int size() {
        return this.size;
    }

    /**
     * @param e el elemento a guardar
     *          Agrega un elemento e a la última posición de la lista
     */
    public void add(int e) {
        if (size == elements.length) { // c_1 = 2   O(1)
            int[] nuevo = new int[elements.length << 1]; // c_2 = 3     O(1)
            for (int i = 0; i < elements.length; i++) { // c_2 + c_4*n      O(n)
                nuevo[i] = elements[i]; // c_5*n    O(n)
            }
            elements = nuevo; // c_6    O(1)
        }
        elements[size] = e; // c_6   O(1)
        size++; // c_6      O(1)
    }


    /**
     * @param i es un íncide donde se encuentra el elemento posicionado
     *          Retorna el elemento que se encuentra en la posición i de la lista.
     */
    public int get(int i) {
        if (i < size && i >= 0) {
            return elements[i];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }


    /**
     * @param index es la posicion en la cual se va agregar el elemento
     * @param e     el elemento a guardar
     *              Agrega un elemento e en la posición index de la lista
     */
    public int[] add(int index, int e) {
        if (index <= size) {
            elements[index] = e;
            int[] aux = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++) {
                aux[i] = elements[i];
            }
            elements = aux;
            for (int j = index + 1; j < elements.length - 1; j++) {
                aux[j + 1] = aux[j];
            }
            elements = aux;
        } else {
            elements[size] = e;
        }
        return elements;
    }


    /**
     * @param index es la posicion en la cual se va a eliminar el elemento
     *              <p>
     *              ELimina el elemento  en la posición index de la lista
     */
    public void del(int index) {
        if (index < size && index >= 0) {
            int[] nuevo = new int[elements.length];
            System.arraycopy(elements, 0, nuevo, 0, index - 1);
            if (elements.length - index + 1 >= 0)
                System.arraycopy(elements, index, nuevo, index - 1, size - index);
            elements = nuevo;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }

    }

    @Override
    public String toString() {
        return "MiArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}

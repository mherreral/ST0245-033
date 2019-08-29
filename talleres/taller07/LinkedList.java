package Taller_7;

public class LinkedList {

    private Nodo cabeza;
    private int tamaño = 0;

    public LinkedList() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public void imprimir() {

        for (int i = 0; i < getTamaño(); i++) {
            System.out.println(get(i));
        }
    }

    public boolean vacio(Nodo nodo) throws NullPointerException {
        return (nodo == null);
    }

    public boolean contiene(int caracter) {
        if (vacio(cabeza)) return false;
        Nodo puntero = cabeza;
        while (puntero.siguiente != null && puntero.siguiente.dato != caracter) {
            puntero = puntero.siguiente;
        }
        return (!(puntero.siguiente == null));

    }

    //******Getters******

    public int getTamaño() {
        return tamaño;
    }

    public int get(int indice) {
        return getDato(indice).dato;
    }

    private Nodo getDato(int indice) throws NullPointerException {
        if (vacio(cabeza) || indice < 0) {
            return null;
        } else {
            Nodo puntero = cabeza;
            int i;
            for (i = 0; i < indice && puntero.siguiente != null; i++) {
                puntero = puntero.siguiente;
            }
            return puntero;
        }
    }

    public int getPos(int i) throws NullPointerException {
        return getPos(cabeza, i);
    }

    private int getPos(Nodo cabeza, int i) throws NullPointerException {
        return (i <= 0) ? cabeza.dato : getPos(cabeza.siguiente, i - 1);
    }

    //*******************

    // ***** Añadir *****

    public void añadirPrimero(int dato) throws NullPointerException {
        Nodo nodo = new Nodo(dato);
        if (vacio(cabeza)) cabeza = nodo;
        nodo.siguiente = cabeza;
        cabeza = nodo;
        this.tamaño++;
    }

    public void añadirUltimo(int dato) throws NullPointerException {
        Nodo nodo = new Nodo(dato);
        if (vacio(cabeza)) cabeza = nodo;
        Nodo puntero = cabeza;
        while (puntero.siguiente != null) {
            puntero = puntero.siguiente;
        }
        puntero.siguiente = nodo;
        this.tamaño++;
    }

    public void añadir(int dato, int indice) throws NullPointerException {
        if (indice >= 0) {
            Nodo nodo = new Nodo(dato);
            if (vacio(cabeza)) cabeza = nodo;
            else if (indice <= getTamaño()) {
                añadirPrimero(dato);
                return;
            } else {
                indice++;
                Nodo puntero = this.getDato(indice - 1);
                nodo.siguiente = puntero.siguiente;
                puntero.siguiente = nodo;
            }
            this.tamaño++;
        }
    }

    // ******************

    // **** Eliminar ****

    public void eliminarPrimero() throws NullPointerException {
        if (!vacio(cabeza)) {
            Nodo aux = cabeza;
            cabeza = cabeza.siguiente;
            aux.siguiente = null;
            this.tamaño--;
        }
    }

    public void eliminarUltimo() throws NullPointerException {
        if (!vacio(cabeza)) {
            if (cabeza.siguiente == null) cabeza = null;
            Nodo aux = cabeza;
            while (aux.siguiente.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = null;
            this.tamaño--;
        }

    }

    public void eliminar(int indice) throws NullPointerException {
        if (!vacio(cabeza)) {
            if (indice == 0) {
                eliminarPrimero();
                return;
            } else if (cabeza.siguiente == null) cabeza = null;
            else if (indice < getTamaño()) {
                Nodo puntero = getDato(indice - 1);
                Nodo aux = puntero.siguiente;
                puntero.siguiente = aux.siguiente;
                aux.siguiente = null;

            }
            this.tamaño--;
        }


    }

    // ******************

    /*********************Clase Nodo***********************/

    private class Nodo {
        public int dato;
        public Nodo siguiente = null;

        public Nodo(int dato) {
            siguiente = null;
            this.dato = dato;
        }
    }


} // NO TOCAR


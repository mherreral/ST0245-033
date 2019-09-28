package Taller_9;


public class Agenda {

    UnaTablaDeHash agenda = new UnaTablaDeHash();

    static void añadir(UnaTablaDeHash agenda, String nombre, int numero) {
        agenda.put(nombre, numero);
    }

    static void buscar(UnaTablaDeHash agenda, String nombre) {
        agenda.get(nombre);
    }


}

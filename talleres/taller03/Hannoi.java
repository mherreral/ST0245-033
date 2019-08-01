package Recursion;

import org.w3c.dom.ls.LSOutput;

public class Hannoi {
    public static void hannoiAux(int n, String origen, String intermedio, String destino) {
        if (n == 1) {

            System.out.println("Mover " + n + " de la torre " + origen + " a la Torre " + destino);

        } else {

            hannoiAux(n - 1, origen, destino, intermedio);
            System.out.println("Mover " + n + " de la torre " + origen + " a la Torre " + destino);

            hannoiAux(n- 1, intermedio, origen, destino);

        }
    }

    public static void hannoi(int n) {
        hannoiAux(n, "Origen", "Intermedio", "Destino");
    }

}

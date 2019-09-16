
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class brazoRobotico {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int[] arreglo = new int[num];
        List<Stack<Integer>> lista = new LinkedList<>();

        for (int i = 0; i < num; i++) {
            Stack<Integer> stack = new Stack<>();
            stack.push(i);
            arreglo[i] = i;
            lista.add(stack);
        }

        while (sc.hasNext()) {

            String linea = sc.nextLine();
            if ("quit".equals(linea)) {
                break;
            }

            String[] separado = linea.split(" ");
            String operation = separado[0] + separado[2];
            int a = Integer.parseInt(separado[1]);
            int b = Integer.parseInt(separado[3]);

            switch (operation) {
                case "pileover":
                    pileOver(lista, arreglo, a, b);
                    break;
                case "pileonto":
                    pileOnto(lista, arreglo, a, b);
                    break;
                case "moveover":
                    moveOver(lista, arreglo, a, b);
                    break;
                case "moveonto":
                    moveOnto(lista, arreglo, a, b);

                    break;

            }

        }
        imprimir(lista);
    }

    public static void moveOnto(List<Stack<Integer>> lista, int[] arreglo, int a, int b) {
        ListIterator<Stack<Integer>> iterador1;
        ListIterator<Stack<Integer>> iterador2;

        iterador1 = lista.listIterator(0);
        iterador2 = lista.listIterator(0);

        for (int i = 0; i < arreglo[a]; i++) {
            iterador1.next();
            //System.out.println(iterador1.next());
        }

        while (iterador1.next().peek() != a) {
            int nuevo = iterador1.next().peek();
            iterador1.next().pop();
            arreglo[nuevo] = nuevo;
            for (int i = 0; i < nuevo; i++) {
                iterador2.next();
            }
            iterador2.next().push(nuevo);
        }

        iterador1 = lista.listIterator(0);
        iterador2 = lista.listIterator(0);

        for (int i = 0; i < arreglo[b]; i++) {
            iterador1.next();
        }

        while (iterador1.next().peek() != b) {
            int nuevo = iterador1.next().peek();
            iterador1.next().pop();
            arreglo[nuevo] = nuevo;
            for (int i = 0; i < nuevo; i++) {
                iterador2.next();
            }
            iterador2.next().push(nuevo);
        }
        ListIterator<Stack<Integer>> bloque = lista.listIterator(0);
        for (int i = 0; i < arreglo[a]; i++) {
            bloque.next();
        }
        bloque.next().pop();
        bloque = lista.listIterator(0);
        for (int i = 0; i < arreglo[b]; i++) {
            bloque.next();
        }

        bloque.next().push(a);

        arreglo[a] = arreglo[b];

    }

    public static void moveOver(List<Stack<Integer>> lista, int[] arreglo, int a, int b) {

        ListIterator<Stack<Integer>> iterador1;
        iterador1 = lista.listIterator(0);
        ListIterator<Stack<Integer>> iterador2 = lista.listIterator(0);

        for (int i = 0; i < arreglo[a]; i++) {
            iterador1.next();
        }

        while (iterador1.nextIndex() != a) {
            int nuevo = iterador1.next().peek();
            iterador1.next().pop();
            arreglo[nuevo] = nuevo;
            for (int i = 0; i < nuevo; i++) {
                iterador2.next();
            }
            iterador2.next().push(nuevo);
        }
        ListIterator<Stack<Integer>> bloque = lista.listIterator(0);
        for (int i = 0; i < arreglo[a]; i++) {
            bloque.next();
        }
        bloque.next().pop();
        bloque = lista.listIterator(0);
        for (int i = 0; i < arreglo[b]; i++) {
            bloque.next();
        }

        bloque.next().push(a);

        arreglo[a] = arreglo[b];

    }

    public static void pileOnto(List<Stack<Integer>> lista, int[] arreglo, int a, int b) {
        ListIterator<Stack<Integer>> iteradorb = lista.listIterator(0);
        ListIterator<Stack<Integer>> iteradorb2 = lista.listIterator(0);

        for (int i = 0; i < arreglo[b]; i++) {
            iteradorb.next();
        }

        while (iteradorb.next().peek() != a) {
            int nuevo = iteradorb.next().lastElement();
            arreglo[nuevo] = nuevo;
            for (int i = 0; i < nuevo; i++) {
                iteradorb2.next();
            }
            iteradorb2.next().push(nuevo);
        }
        ListIterator<Stack<Integer>> iterator = lista.listIterator();
        for (int i = 0; i < arreglo[a]; i++) {
            iterator.next();
        }
        ArrayList<Integer> array;
        array = new ArrayList<>();
        while (true) {
            int aux = iterator.next().peek();
            arreglo[aux] = arreglo[b];
            iterator.next().pop();
            array.add(aux);
            if (aux == a) {
                break;
            }
        }
        ArrayList<Integer> nuevo = new ArrayList<>();
        for (int i = array.size(); i > 0; i--) {
            for (int j = 0; j < array.size(); j++) {
                nuevo.add(j, array.get(i - 1));
            }
        }
        iterator = lista.listIterator();
        for (int i = 0; i < arreglo[b]; i++) {
            iterator.next();
        }
        for (int i = 0; i < nuevo.size(); i++) {
            iterator.next().push(nuevo.get(i));
        }
    }

    public static void pileOver(List<Stack<Integer>> lista, int[] arreglo, int a, int b) {
        ListIterator<Stack<Integer>> iterator = lista.listIterator(0);
        for (int i = 0; i < arreglo[a]; i++) {
            iterator.next();
        }
        ArrayList<Integer> array = new ArrayList<>();
        while (true) {
            int aux = iterator.next().peek();
            arreglo[aux] = arreglo[b];
            iterator.next().pop();
            array.add(aux);
            if (aux == a) {
                break;
            }
        }
        ArrayList<Integer> nuevo = new ArrayList<>();
        for (int i = array.size(); i > 0; i--) {
            for (int j = 0; j < array.size(); j++) {
                nuevo.add(j, array.get(i - 1));
            }
        }
        iterator = lista.listIterator();
        for (int i = 0; i < arreglo[b]; i++) {
            iterator.next();
        }
        for (int i = 0; i < nuevo.size(); i++) {
            iterator.next().push(nuevo.get(i));
        }
    }

    public static void imprimir(List<Stack<Integer>> lista) {
        ListIterator<Stack<Integer>> iterator= lista.listIterator(0);
        ArrayList<Integer> nuevo = new ArrayList<>();
        int vamos = 0;
        for(int i = 0; i<lista.size(); i++){
            iterator.next();
            System.out.print(vamos + ":");
            while(!lista.listIterator().next().isEmpty()){
                nuevo.add(lista.listIterator(0).next().pop());
            }
            for(int j=0; j<nuevo.size(); j++){
                System.out.print(" " + nuevo.get(j));
            }
            nuevo.clear();
            vamos++;
        }
    }	
}


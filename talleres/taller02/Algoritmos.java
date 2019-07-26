public class Algoritmos {
    public static void main(String[] args){
        int elements[] = {5, 5, 5};
        System.out.println(euclides(10, 5));
        //System.out.println(juego(0, elements, 10));
        combinacion("hola");

    }

    public static int euclides(int p, int q){
        if(p-q == 0) {
            return q;
        }  return euclides(q,  p-q);
    }

    public static boolean juego(int inicio, int[] elementos, int target){
        if(inicio >= elementos.length){
            return target == 0;
        }
        else
            return juego(inicio+1, elementos, target) || juego(inicio+1, elementos, target + elementos[inicio]);
    }

    public static void combinacion(String palabra){
        combiAux("", palabra);
    }

    public static void combiAux(String guardado, String palabra){
        if(palabra.length()==0){
            System.out.println(guardado);
        }
        else{
            combiAux(guardado + palabra.charAt(0), palabra.substring(1));
            combiAux(guardado, palabra.substring(1));
        }
    }


}

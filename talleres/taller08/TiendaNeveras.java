import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TiendaNeveras {
    
 
    public static void main(String[] args) {
        LinkedList<String> lista = new LinkedList<>();
        lista.add(0,"1 haceb");
        lista.add(1,"2 lg");
        lista.add(2,"3 ibm");
        lista.add(3,"4 haceb");
        lista.add(4,"5 lg");
        lista.add(5,"6 ibm");
       
         LinkedList<String> solicitud = new LinkedList<>();
         solicitud.add("éxito 1");
         solicitud.add("olimpica 4");
         solicitud.add("la14 2");

         ejercicio2(lista, solicitud);
    }
   
    public static void ejercicio2(LinkedList<String> almacen, LinkedList<String> solicitud){
        Stack<String> pila = new Stack<>();
        for(int i  =0; i<almacen.size();i++){
            pila.push(almacen.get(i));
        }
        Queue<String> cola = new LinkedList<>();
       
        int[] cantidad = new int[solicitud.size()];
        String[] nombre = new String[solicitud.size()];
        for(int i=0; i<solicitud.size(); i++){
            cola.add(solicitud.get(i));
            String[] aux = new String[solicitud.size()];
            aux = solicitud.get(i).split(" ");
            nombre[i] = aux[0];
            cantidad[i] = Integer.parseInt(aux[1]);
        }
        for(int i =0; i<pila.size(); i++){
            if(cantidad[i]<=pila.size()){
                System.out.print("el almacen "+nombre[i]+ "," + " ");
                for(int j=0; j<cantidad[i];j++){
                    if(cantidad[i]>1)
                        System.out.println(pila.lastElement()+ ",");
                    else
                        System.out.println(pila.lastElement());
                    pila.pop();
                }
                cola.poll();
            }
        }
    }
}

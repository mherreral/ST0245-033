
import java.util.HashMap;
import java.util.Iterator;

public class VentaArepas {

    public static void main(String[] args) {
        llavesAsociadas(asignar(), "Estados Unidos");

    }

    public static HashMap asignar() {
        HashMap<String, String> compañias = new HashMap<String, String>();

        compañias.put("Google", "Estados Unidos");
        compañias.put("La Locura", "Colombia");
        compañias.put("Nokia", "Finlandia");
        compañias.put("Sony", "Japón");
        return compañias;
    }

    public static void buscar(HashMap compañias, String key) {
        if (compañias.containsKey(key)) {
            System.out.println(compañias.get(key));
        } else {
            System.out.println("No está en la tabla");
        }
    }

    public static void llavesAsociadas(HashMap compañias, String valor) {
        Iterator iterador = compañias.keySet().iterator();

        while (iterador.hasNext()) {
            String key = (String) iterador.next();
            if (compañias.get(key).equals(valor)) {
                System.out.println(key);
            } 
        }

    }
}

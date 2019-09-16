
import java.util.LinkedList;
import java.util.Scanner;

public class TecladoRoto {

    public static void main(String[] args) {
        System.out.println("Escriba el input");
        Scanner scanner = new Scanner(System.in);
        String caracteres = scanner.next();
        
        LinkedList<Character> linkedList = new LinkedList<>();
        
        System.out.println("Escriba 'EOL' para ver cómo sería el output");
        
        while (scanner.next().equals("EOL")) {
            int voy = 0;
            for (char caracter : caracteres.toCharArray()) {
                switch (caracter) {
                    case '[':
                        voy = 0;
                        break;
                    case ']':
                        voy = linkedList.size();
                        break;
                    default:
                        linkedList.add(voy++, caracter);
                        break;
                }
            }
            linkedList.forEach((caracter) -> {
                System.out.print(caracter);
            });
            break;
        }
    }
}

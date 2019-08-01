package Recursion;

public class Desencriptado {
    private static void permutacionAux(String base, String s) {
        if (s.length() == 0) {
           //System.out.println(base);
            System.out.print(AdvancedEncryptionStandard.desencriptarArchivo(base));
        } else {
            for (int i = 0; i < s.length(); i++) {
                permutacionAux(base + s.charAt(i), s.substring(0,i) + s.substring(i + 1));

            }
        }
    }

    public static void permutacion(String s) {
        permutacionAux("", s);
    }


}

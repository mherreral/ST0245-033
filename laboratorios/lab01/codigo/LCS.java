package Laboratorio_1;

public class LCS {

    public static int LCS(String cadena1, String cadena2){

        if (cadena1.length() == 0 || cadena2.length() == 0){
            return  0;
        }else if (cadena1.charAt(cadena1.length() - 1) == cadena2.charAt(cadena2.length() - 1)){
            return  LCS(cadena1.substring(0, cadena1.length() - 1), cadena2.substring(0, cadena2.length() - 1)) + 1;
        }
        return Math.max(
                   LCS(cadena1.substring(0, cadena1.length() - 1), cadena2),
                   LCS(cadena1, cadena2.substring(0, cadena2.length() - 1))
        );

    }
    
}

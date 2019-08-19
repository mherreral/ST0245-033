package Laboratorio_1;

public class PuertoUraba {

    public static int combinaciones(int n){
        return (n <= 3) ? n : combinaciones(n - 1) + (n - 2);
    }
}

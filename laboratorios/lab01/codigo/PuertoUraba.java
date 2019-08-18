package Laboratorio_1;

public class PuertoUraba {

    public static int combinaciones(int n){
        return (n <= 3) ? n : combinaciones(n - 1) + ( n - 2);
        /*
        if (n <= 3) return  n; //c_1
        return combinaciones(n - 1) + (n - 2); // T(n) = T(n-1) + n + c_2
        */

    }



}

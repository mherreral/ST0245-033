package Laboratorio_1;

public class CodingBatRec1 {

    public int powerN(int base, int n){
        return (n == 1) ? base : base * powerN(base,n - 1);
    }

    public int countX(String str){
        int cont = 0;
        if(str.length() == 0) return 0;
        if(str.charAt(0) == 'x') { cont++ ;}
        cont += countX(str.substring(1));
        return cont;
    }

    public int bunnyEars(int conejos){
        return (conejos == 0) ? 0 : 2 + bunnyEars(conejos - 1);
    }

    public int count7(int n){
        int suma;
        if(n == 0) return 0;
        suma = n % 10;
        n /= 10;
        return (suma == 7) ? 1 + count7(n) : count7(n);
    }

    public int fibonacci(int n){
        return (n == 0 || n == 1) ? n : fibonacci(n - 2) + fibonacci(n - 1);
    }

}



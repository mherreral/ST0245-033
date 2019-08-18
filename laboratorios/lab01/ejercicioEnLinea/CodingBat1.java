

/**
 *
 * @author mherreral
 */
public class CodingBat1 {
    
    public static int powerN(int base, int n){
    if(n ==1) return base;   
    return base * powerN(base, n-1); 
    }
    
    public static int countX(String str){
    int cont = 0;
    if(str.length()==0) return 0;
    if(str.charAt(0)=='x') {
        cont++;
    } 
    cont += countX(str.substring(1, str.length())); 
    return cont;
    }
    
    public static int bunnyEars(int conejos){
    if(conejos==0) return 0;
    return 2 + bunnyEars(conejos-1); 
    }
    
    public static int count7(int n){
    int suma = 0;
    if(n==0) return 0;
    suma = n%10;
    n = n/10;
    if(suma==7) return 1 + count7(n); 
    return count7(n); 
    }
    
    
    public static int fibonacci(int n){
    if(n == 0 || n == 1) return n;
    return fibonacci(n-2)+fibonacci(n-1);
    }
    
}

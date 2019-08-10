import java.util.Random;

public class Algoritmos {

    public static void main(String[] args) {
        System.out.println("Primer ejercio");


        for (int i = 30; i <= 50; i++) {
            //long startTime = System.currentTimeMillis();
            long startTime = System.nanoTime();
            sumatoria(arreglo(1000), 0);
            //long end = System.currentTimeMillis();
            long end = System.nanoTime();
            System.out.println(end - startTime);
        }
  
        System.out.println("Segundo ejercio");
       
        for(int i = 30; i <= 50; i++){
            long startTime2 = System.currentTimeMillis();
            sumaVols(0, arreglo(25), i);
            long end2 = System.currentTimeMillis();
            System.out.println(end2 - startTime2);
        }
    }
    
    public static int[] arreglo(int tamaño){

        int[] array = new int[tamaño];
        Random generator = new Random();
        for(int i = 0; i < tamaño; i++){
            array[i] = generator.nextInt(1000);
        }
        return array;
        
    }
   
    public static boolean sumaVols(int inicio, int[] nums, int vol){
    	return (inicio >= nums.length) ? vol == 0 :
    	sumaVols(inicio + 1, nums, vol - nums[inicio]) ||
    	sumaVols(inicio + 1, nums, vol); //Complejidad c_2 = T(n) - 2 T(n - 1)
    	/*
        if (inicio >= nums.length) return vol == 0; //c_1
        return sumaVols(inicio + 1, nums, vol - nums[inicio]) ||
        sumaVols(inicio + 1, nums, vol); // T(n) = 2T(n-1) + c_2
		*/
    }											 
   
    public static int sumatoria(int[] nums, int tam) {
    	return (tam == 0) ? nums[tam] :  nums[tam] + sumatoria(nums, tam - 1); //Complejidad c_2 = T(n) - T(n - 1)
     /*
        if (ini == nums.length) {
            return ini; //c1
        } else {
            return nums[ini] + sumatoria(nums, ini + 1); //T(n) = c_2 + T(n-1)        
        }*/										         
    }

    public static int fibonacci(int n) {
   
    	if (n <= 0)
    		return 0;
    	else if (n == 1) {
    		return 1;
    	}
    	else
    		return fibonacci(n - 1) + fibonacci(n - 2);


    }
   
}
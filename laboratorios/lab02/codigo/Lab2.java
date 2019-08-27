/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;

/**
 *
 * @author manuh
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Tiempos para insertionSort");
        long startTime = System.nanoTime();
        
        for (int i = 1000; i <= 1020; i++) {
            //long startTime = System.currentTimeMillis();
            //long startTime = System.nanoTime();
            Codigo.InsertionSort(generadorArreglos(i));
            //long end = System.currentTimeMillis();
            long end = System.nanoTime();
            System.out.println(end - startTime);
        }
        
        System.out.println("Tiempos para MergeSort");
        long inicia = System.nanoTime();
        for (int i = 1000; i <= 1020; i++) {
            //long startTime = System.currentTimeMillis();
            //long startTime = System.nanoTime();
            Codigo.mergeSort(generadorArreglos(i));
            //long end = System.currentTimeMillis();
            long end = System.nanoTime();
            System.out.println(end - inicia);
        }

    }

    public static int[] generadorArreglos(int tamaño) {

        int[] array = new int[tamaño];
        Random generator = new Random();
        for (int i = 0; i < tamaño; i++) {
            array[i] = generator.nextInt(899999);
        }
        return array;
    }
}

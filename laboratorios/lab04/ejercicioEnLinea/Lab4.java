/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Manuela
 */
public class Lab4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recorridoPosorden(generador());
    }
    
    public static Tree generador(){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Ingrese la cantidad de nodos que tiene el árbol");
        n = sc.nextInt();
        int[] arreglo = new int[n];
        for(int i =0; i<n;i++){
            arreglo[i] = sc.nextInt();
        }
        Tree arbol = new Tree(arreglo[0]);
        for(int i =1; i<n-1;i++){
            arbol.insert(arbol.node, arreglo[i]);
        }
        return arbol;
    }
    
   //EMPEZAR RECORRIDO PORORDEN
    public static void recorridoPosorden(Tree arbol)
    {
        ayudantePosorden(arbol.node);        
    }
    
    //meotod recursivo para recorrido posorden
    public static void ayudantePosorden(Node nodo)
    {
        if( nodo == null )
            return;
        
        ayudantePosorden(nodo.left);
        ayudantePosorden(nodo.right);
        System.out.print(nodo.value);
    }
    
}

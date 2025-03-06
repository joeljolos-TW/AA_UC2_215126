/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 * Clase que almacenara los metodos de ordenamiento.
 * Class that will store the order methods.
 * @author joel_
 */
public class Ordenamiento {
    /**
     * Metodo de ordenamiento de burbuja
     * @param arreglo 
     */
    public static void bubbleSort(int[] arreglo) {
        
        for (int i = 1; i < arreglo.length; i++) {//declaracion : 1, comparacion : n-1, incremento: n || = 2n
            
            for (int j = 0; j < arreglo.length - i; j++) {// declaracion : n, comparacion : n^2-n, incremento : n^2 || = 2n^2
                if (arreglo[j] > arreglo[j + 1]) {// comparacion : n^2 suma : n^2|| = 2n^2
                    int aux = arreglo[j];// declaracion : n^2 || = n^2
                    arreglo[j] = arreglo[j + 1];// declaracion : n^2 suma : n^2|| = 2n^2
                    arreglo[j + 1] = aux;// declaracion : n^2 suma : n^2|| = 2n^2
                }
            }
        }

    } // (2n)+(2n^2)+(2n^2)+(n^2)+(2n^2)+(2n^2) = (9n^2+2n) || O(x^2)
}

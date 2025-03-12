/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Algoritmos.Busquedas;
import Algoritmos.Ordenamiento;
import java.util.Arrays;
/**
 * Clase principal para las pruebas de los algoritmos.
 * Principal class to make tests of the algorithms.
 * @author joel_
 */
public class Main {

    
    public static void main(String[] args) {
        int[] arr = {4,10,9,8};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr));
        Ordenamiento.bubbleSort(arr);
        System.out.println("El arreglo al final: "+Arrays.toString(arr));
        
        int[] arr1= {5,21,48,10,1};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr1));
        Ordenamiento.insercion(arr1);
        System.out.println("El arreglo al Final: "+Arrays.toString(arr1));
        
        int[] arr2= {37,7,51,22,9};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr2));
        Ordenamiento.seleccion(arr2);
        System.out.println("El arreglo al final: "+Arrays.toString(arr2));
    }
    
}

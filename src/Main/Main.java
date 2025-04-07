/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Algoritmos.Busquedas;
import Algoritmos.Ordenamiento;
import java.util.Arrays;
/**
 *
 * @author joel_
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = {4,10,9,8};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr));
        Ordenamiento.bubbleSort(arr);
        System.out.println("El arreglo al final: "+Arrays.toString(arr)+"\n");
        
        int[] arr1= {5,21,48,10,1};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr1));
        Ordenamiento.insercionSort(arr1);
        System.out.println("El arreglo al Final: "+Arrays.toString(arr1)+"\n");
        
        int[] arr2= {37,7,51,22,9};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr2));
        Ordenamiento.seleccionSort(arr2);
        System.out.println("El arreglo al final: "+Arrays.toString(arr2)+"\n");
        
        int[] arr3 = {42, 17, 89, 5, 63, 28, 91, 34, 76, 12};
        System.out.println("El arreglo al inicio: "+Arrays.toString(arr3));
        Ordenamiento.quickSort(arr3,0,arr3.length-1);
        System.out.println("El arreglo al final: "+Arrays.toString(arr3));
    }
    
}

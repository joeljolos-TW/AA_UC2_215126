/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Algoritmos;

/**
 * Clase que almacenara los metodos de ordenamiento. Class that will store the
 * order methods.
 *
 * @author joel_
 */
public class Ordenamiento {

    /**
     * Metodo de ordenamiento de burbuja
     *
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

    /**
     * Metodo de ordenamiento por insercion
     *
     * @param arreglo
     */
    public static void insercionSort(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {

            int key = arreglo[i];
            int j = i - 1;
            while (j >= 0 && key < arreglo[j]) {
                arreglo[j + 1] = arreglo[j];
                j--;
            }
            arreglo[j + 1] = key;
        }
    }

    /**
     * Metodo de ordenamiento por busqueda
     *
     * @param arreglo
     */
    public static void seleccionSort(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            int indMenor = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < arreglo[indMenor]) {
                    indMenor = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[indMenor];
            arreglo[indMenor] = aux;
        }

    }
    /**
     * metodo recursivo de ordenamiento Rapido
     * @param nums
     * @param low
     * @param high 
     */
    public static void quickSort(int[] nums, int low, int high) {
        if (low < high) {

            int pivot = partition(nums, low, high);

            quickSort(nums, low, pivot - 1);

            quickSort(nums, pivot + 1, high);
        }
    }
    /**
     * metodo para encontrar el pivote del arreglo
     * @param nums
     * @param low
     * @param high
     * @return 
     */
    public static int partition(int[] nums, int low, int high) {

        int pivot = nums[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (nums[j] <= pivot) {

                i++;

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        int temp = nums[i + 1];
        nums[i + 1] = nums[high];
        nums[high] = temp;

        return i + 1;
    }
}

/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import java.util.Scanner;

public class Ejemplo08 {

    public static void main(String[] args) {
        // Ingresar por teclado el tamaño de un arreglo
        // Ingresar por teclado los valores enteros del arreglo
        // Sumar los valores del arreglo, mediante la función misterio
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo unidimensional");
int tamaño = entrada.nextInt();
        int[] arreglo1 = new int[tamaño];
        for (int i = 0; i < arreglo1.length; i++) {
            System.out.printf("ingrese valor para %d\n", arreglo1[i]);
            arreglo1[i] = entrada.nextInt();
        }
        int suma = misterio(arreglo1, arreglo1.length);
        System.out.printf("Suma total del arreglo: %d \n", suma);

    }


    public static int misterio(int[] arreglo, int tamanio) {

        if (tamanio == 1) {
            return arreglo[0];
        } else {
            return arreglo[tamanio - 1] + misterio(arreglo, tamanio - 1);
        }
    }

}

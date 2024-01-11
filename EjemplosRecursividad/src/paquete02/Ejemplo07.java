/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

import static paquete01.Ejemplo08.misterio;

public class Ejemplo07 {

    public static void main(String[] args) {
        int[] valores = {2, 3, 4, 5, 6, 7, 8};
        int[] potencias = {2, 3};
        // Por cada posición del arreglo valores
        // obtener su potencia, en función de los valores
        // del arreglo potencias
        // Ejemplo:
        // posición 0 de valores es 2
        // se debería presentar el resultado de
        // 2 elevado a la potencia 2 (cuadrado)
        // 2 elevado a la potencia 3 (cubo)
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < potencias.length; j++){
                int potencia = obtenerPotencia(valores[i], potencias[j]);
                System.out.printf("%d elevado al %d es %d\n",valores[i],
                        potencias[j],potencia);
            }
        }
    }

    public static int obtenerPotencia(int base, int exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * obtenerPotencia(base, exponente - 1);
        }
    }

}

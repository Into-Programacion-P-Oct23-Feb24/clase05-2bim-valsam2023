/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package paquete02;

public class Ejemplo06 {

    public static void main(String[] args) {

        int[] valor1 = {100, 1000, 200, 2000, 3000};
        int[] valor2 = {1, 2, 3, 4, 5};
        
        // Encontrar la suma de las posiciones
        // [0][0]
        // [1][1]
        // hasta el final
        
        for (int i = 0; i < valor1.length; i++) {
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(valor1[i], valor2[i]));
        }
        
        /* En este for utiliza directamente los elementos de los arreglos de valor
        1 y valor 2 en la posicion que en ese momento vale i y se los imprime, luego
        i incrementa, y se repite el ciclo, hasta que la cantidad de valor 1 sea 
        mayor a i. 
        */
        
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            System.out.printf("El valor es: %d\n", 
                    obtenerSuma(num1, num2));
        }
        /*
        En este for declramos variables dentro del for 
        */
        
        for (int i = 0; i < valor1.length; i++) {
            int num1 = valor1[i];
            int num2 = valor2[i];
            int suma = obtenerSuma(num1, num2); 
            System.out.printf("El valor es: %d\n", suma);
        }
        
    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}

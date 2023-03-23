
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * Escribir un programa que lea un número entero y devuelva el número de
dígitos que componen ese número. Por ejemplo, si introducimos el
número 12345, el programa deberá devolver 5. Calcular la cantidad de
dígitos matemáticamente utilizando el operador de división. Nota:
recordar que las variables de tipo entero truncan los números o
resultados.

 */
public class ejercicio11 {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        int  j = 1;
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++){
            num = num / 10;
           j++;
        }
        System.out.println("La cantidad de digitos es de: " + j);
    }
}

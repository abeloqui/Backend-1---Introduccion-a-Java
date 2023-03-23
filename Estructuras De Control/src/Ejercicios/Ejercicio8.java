
package Ejercicios;

import java.util.Scanner;

/**
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
* Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
* lo siguiente:
* * * *
*     *
*     *
* * * *

 */
public class Ejercicio8 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño");
        int num = leer.nextInt();
        for (int i = 0; i < num; i++){
            for (int x = 0; x < num; x++){
                if (i > 0 && i < num -1 && x > 0 && x < num -1){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
    
}

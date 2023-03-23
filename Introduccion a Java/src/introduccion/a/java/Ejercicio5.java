
package introduccion.a.java;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre
 * por pantalla el doble, el triple y la raíz cuadrada de ese número.
* Nota: investigar la función Math.sqrt().
 *
 */
public class Ejercicio5 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        System.out.println("El doble del numero es: " + (num * 2));
        System.out.println("El triple del numero es: " + (num * 3));
        System.out.println("La raiz cuadrada es: " + Math.sqrt(num));
    }
    
}

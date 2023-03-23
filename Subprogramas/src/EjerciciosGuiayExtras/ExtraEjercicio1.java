
package EjerciciosGuiayExtras;

import java.util.Scanner;

/**
 * Implementar una función que permita obtener un número entero aleatorio comprendido entre dos 
* límites que introduciremos por teclado. El número obtenido se debe mostrar por pantalla.
 */
public class ExtraEjercicio1 {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese primer limite");
        int lim1 = leer.nextInt();
        System.out.println("Ingrese segundo limite");
        int lim2 = leer.nextInt();
        System.out.println("El numero aleatorio es: " + aleatorio(lim1,lim2));
        
    }
    public static int aleatorio(int lim1, int lim2){
        int aleatorio = lim1 + (int)(Math.random() * ((lim2 - lim1) + 1));
        return aleatorio;

    }
}

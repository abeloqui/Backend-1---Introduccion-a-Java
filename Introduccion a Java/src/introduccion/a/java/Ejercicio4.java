
package introduccion.a.java;

import java.util.Scanner;

/** Dada una cantidad de grados centígrados se debe mostrar su
 * equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
public class Ejercicio4 {
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese cantidad de grados centigrados");
         int grados = leer.nextInt();
         double fahren = 32 + (9 * grados / 5 );
         System.out.println("Su equivalente en Fahrenheit es: " + fahren);
         
         
         
     }
    
}

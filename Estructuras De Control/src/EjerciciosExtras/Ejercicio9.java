
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 
 */
public class Ejercicio9 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        int num = 0; int num2 = 0;
        
        do {
                 System.out.println("Ingrese dos numeros:");
                 num = leer.nextInt(); num2 = leer.nextInt();
                 if (num<1){
                     System.out.println("El numero menor a 1 es: " + num);
                     
                 }
                 else if (num2 < 1){
                     System.out.println("El numero menos a 1 es: " + num2);
                     
                 }
                 
        } while(num <= 0 || num2 <= 0);
        
        int rta = 0;
        int i = 0;
        
        while (num2<num){
           
            rta = num - num2;
            
            i++;
            num = rta;
        }
        System.out.println("El residuo es: " + rta + " y el cociente es: " + i);
        
    }
}

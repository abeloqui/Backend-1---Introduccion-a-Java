
package Ejercicios;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los
 * números introducidos supere el límite inicial.
 */
public class Ejercicio5 {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese valor limite:");
        int limite = leer.nextInt();
        int suma = 0 ; int num;
        for (int i = 0 ; i < limite; i++){
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            suma = num + suma;
            if (suma > limite){
                break;
            }
        }

    }
}

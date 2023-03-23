
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * .Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 * El programa debe indicar al usuario si su respuesta es o no correcta. En
 * caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
 * su respuesta nuevamente. Para realizar este ejercicio investigue como
 * utilizar la función Math.random() de Java.

 */
public class Ejercicio10 {
    public static void main (String[]args){
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);
        int rta = num1 * num2;
        System.out.println(rta);
        int rtausuario=0;
        do {
            System.out.println("Ingrese el resultado:");
            rtausuario = leer.nextInt();
            if (rtausuario != rta){
                System.out.println("Respuesta incorrecta");        
            }
            if (rtausuario > rta){
                System.out.println("Es mayor al resultado correcto");     
            }
            else if(rtausuario < rta) {
                System.out.println("Es menor al resultado correcto");
            }
        } while (rtausuario != rta);
        System.out.println("Respuesta correcta");
    }
}

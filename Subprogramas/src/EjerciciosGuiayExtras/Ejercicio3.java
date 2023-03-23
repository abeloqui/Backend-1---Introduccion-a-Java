
package EjerciciosGuiayExtras;

import java.util.Scanner;

/**
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €

 */
public class Ejercicio3 {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de euros(€):");
        double euros = leer.nextInt();
        System.out.println("Ingrese moneda a convertir: dolares / yenes / libras");
        String opcion = leer.next();
       Conversor(euros, opcion);
    }
    public static void Conversor(double euros, String opcion){
        

        switch (opcion.toLowerCase()){
            case "dolares":
                euros = euros * 1.28611;
                break;
            case "libras":
                euros = euros * 0.86;
                break;
            case "yenes":
                euros = euros * 129.852;
                break;
        }
        System.out.println("La conversion es de " + euros +" "+ opcion);
    }
}

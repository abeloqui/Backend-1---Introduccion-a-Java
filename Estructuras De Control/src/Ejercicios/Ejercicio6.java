package Ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por
 * teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
 * una opción y el programa deberá mostrar el resultado por pantalla y
 * luego volver al menú. El programa deberá ejecutarse hasta que se elija la
 * opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
 * vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa
 * (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
 * contrario se vuelve a mostrar el menú.
 */
public class Ejercicio6 {
    public static void main (String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros enteros:");
        int num1 = leer.nextInt(); int num2 = leer.nextInt();
        int opcion;
        String opcion2;
        do{
            System.out.println("Menu");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Salir");
        System.out.println("Elija opcion");
        opcion = leer.nextInt();
        
            switch (opcion){
            case 1 -> {

                int suma = num1 + num2;
                System.out.println("El resultado de la suma es: " + suma);
                break;
                }
            case 2 -> {
                int resta = num1 - num2;
                System.out.println("El resultado de la resta es: " + resta);
                break;
                }
            case 3 -> {
                int multi = num1 * num2;
                System.out.println("El resultado de la multiplicacion es: " + multi);
                break;
                }
            case 4 -> {
                double div = num1 / num2;
                System.out.println("El resultado de la division es de: " + div);
                break;
                }
            case 5 -> {
                System.out.println("Desea Salir?S/N");
                opcion2 = leer.next();
                        if (opcion2.equals("S")){
                            System.out.println("Nos vemos");
                opcion = 5;
            }
                        else {
                                opcion = 0;
                                }
                break;

                }
            default -> System.out.println("Opcion invalida");
                } 
            
        } while(opcion != 5);
    }



}

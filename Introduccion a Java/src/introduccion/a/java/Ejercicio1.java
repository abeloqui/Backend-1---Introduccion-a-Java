package introduccion.a.java;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 1");
        
        /* Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primero numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        System.out.println("El resultado de la suma de ambos numeros es de: " + (num1 + num2));
        
        
        
        
    }
    
}
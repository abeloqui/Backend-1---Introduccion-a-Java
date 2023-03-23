
package Ejercicios;

import java.util.Scanner;

/**
 * Realizar un programa que solo permita introducir solo frases o palabras
 * de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
 * deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
 * caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
 * función Lenght() en Java
 */
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        String fop;
        do {
            System.out.println("Ingrese una frase o palabra");
            fop = leer.nextLine();
            if (fop.length() == 8){
                System.out.println("Correcto");
            }
            else{
                System.out.println("Incorrecto");
            }
        } while (fop.length() > 8 || fop.length() < 8);
        
       
        
     }
    
}


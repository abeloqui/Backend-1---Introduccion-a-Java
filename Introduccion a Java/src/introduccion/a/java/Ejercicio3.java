
package introduccion.a.java;

import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String[] args){
    /*
         Escribir un programa que pida una frase y la muestre toda en mayúsculas
        y después toda en minúsculas.
        Nota: investigar la función toUpperCase() y toLowerCase() en Java.

        */
         
          Scanner leerfrase = new Scanner(System.in);
          System.out.println("Ingrese una frase:");
          String frase = leerfrase.nextLine();
          System.out.println("Frase en Mayuscula: " + frase.toUpperCase());
          System.out.println("Frase en Minuscula: " + frase.toLowerCase());
      
          
    
    
    
    
        
    }   


    }


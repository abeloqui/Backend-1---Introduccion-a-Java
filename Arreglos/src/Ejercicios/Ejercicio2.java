package Ejercicios;

import java.util.Scanner;



/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un número a buscar en el vector. El
* programa mostrará dónde se encuentra el numero y si se encuentra
* repetido
 */
public class Ejercicio2 {
    public static void main (String []args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int [n];
        int  j = 0;
        for (int i = 0; i < n; i++){
            vec[i] = (int) (Math.random()*10);
            System.out.println(vec[i]);
        }
       
        System.out.println("Ingrese numero a buscar en el vector");
        int n2 = leer.nextInt();
        for (int i = 0; i < n;i++){
            if (vec[i] == n2){
                System.out.println("El numero se encuentra en la posicion " + i);
                j++;            
                if (j > 1){
                System.out.println("El numero esta repetido " + j + " veces");
            } 
        }

        }
    }
}

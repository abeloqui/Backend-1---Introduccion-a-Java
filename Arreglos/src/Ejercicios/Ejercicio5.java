package Ejercicios;

import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su
 * propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
 * A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
 * obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] matriz2 = new int [3][3];
        int [][] matriz3 = new int [3][3];
        boolean antisimetrica = true;

        String aux = "";
        
        for (int i = 0; i < 3; i++){
            for (int j =0; j<3; j++){
                System.out.println("Ingrese valor en posicion [" + i + "]" +"[" +j + "]");
                matriz[i][j] = leer.nextInt();
            }
        }
        for (int j = 0; j<3;j++){
            for (int i = 0; i <3; i++){
                matriz2[j][i] = matriz[i][j];
            }
        }
        for (int i = 0; i<3;i++){
            for (int j = 0; j <3; j++){
                matriz3[i][j] = -matriz2[i][j];
            }
        }
//        System.out.println("Matriz original");
//        for (int[] fila : matriz){
//            aux = "";
//            for (int elemento : fila){
//                aux += elemento + "";
//            }
//            System.out.println(aux);
//        }
//        System.out.println("Matriz Traspuesta");
//        for (int[] fila : matriz2){
//            aux = "";
//            for (int elemento : fila){
//                aux += elemento + "";
//            }
//            System.out.println(aux);
//        }
//        
//        System.out.println("Matriz Traspuesta Negativa");
//                for (int[] fila : matriz3){
//            aux = "";
//            for (int elemento : fila){
//                aux += elemento + "";
//            }
//            System.out.println(aux);
//        }
                for (int i = 0; i<3;i++){
            for (int j = 0; j <3; j++){
                if (matriz[i][j] != matriz3[i][j]){
                    antisimetrica = false;
                    break;
                } 
            }
        }
                if (antisimetrica){
                    System.out.println("Es antisimetrica");
                }else{
                    System.out.println("No es antisimetrica");
                }
         
                

    }
}

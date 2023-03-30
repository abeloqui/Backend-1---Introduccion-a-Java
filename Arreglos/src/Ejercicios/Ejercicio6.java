
package Ejercicios;

import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
 * 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son
 * idénticas. Crear un programa que permita introducir un cuadrado por
 * teclado y determine si este cuadrado es mágico o no. El programa
 * deberá comprobar que los números introducidos son correctos, es decir,
 * están entre el 1 y el 9.

 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("Ingrese un tamaño para matriz");
        n=leer.nextInt();
        int [][] matriz= new int [n][n];
        for (int i=0; i<n; i++ ){
            for (int j=0; j<n; j++){
                System.out.println("Ingrese un numero");
                matriz[i][j]=leer.nextInt();
                while (matriz[i][j] <1 || matriz[i][j]>9 ) {                    
                    System.out.println("Ingrese un numero entre 1 y 9");
                matriz[i][j]=leer.nextInt();
                }
        }}
        int sf,sc,sd,cf,cc,cd,cont;
        //suma diagonal
        sd=0;
          for (int i=0; i<n ;i++ ){
            for (int j=0; j<n; j++){
                if (i==j){
                    sd= matriz[i][j]+sd;
                }
            }}
          //suma de las filas
          cont=0;
         cf=0;   
        for (int i=0; i<n; i++){
           sf=0;
            for (int j=0; j<n; j++){
               sf = matriz[i][j]+sf ;
               
            if (sf==sd){
                cf=cf+1;
                cont=cont+1;
            }
            }}
        //suma columna
        cc=0;   
        for (int j=0; j<n; j++){
           sc=0;
            for (int i=0; i<n; i++){
               sc = matriz[i][j]+sc ;
            if (sc==sd){
                cc=cc+1;
            cont=cont+1;}}}
        
      if (cont+1==(n*2)+1){
          System.out.println("La matriz es magica");
      }else {
          System.out.println("La matriz no es magica");
        
    }
    
}
    }


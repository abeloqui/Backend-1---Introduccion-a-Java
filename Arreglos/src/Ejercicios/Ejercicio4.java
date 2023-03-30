
package Ejercicios;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
 * A se denota por B y se obtiene cambiando sus filas por columnas (o
 * viceversa)
 */
public class Ejercicio4 {
    public static void main (String [] args){
        int[][] matrix = new int  [3][3];
        int[][] matrix2 = new int  [3][3];
        
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                matrix[i][j] = (int) (Math.random()*50);
            }

        }
        System.out.println("Matriz");
        for (int i = 0; i < 3; ++i){
            for (int j = 0; j < 3; ++j){
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println(" ");
        }
        System.out.println("Matriz Traspuesta");
        for (int j = 0; j < 3; ++j){
            for (int i = 0; i < 3; ++i){
                matrix2[j][i] = matrix[i][j];
                System.out.print("[" + matrix2[j][i] + "]");
            }
            System.out.println(" ");
        }
        

    }
}

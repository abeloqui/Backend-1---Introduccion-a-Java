
package EjerciciosGuiayExtras;

import java.util.Scanner;

/**
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.
 */
public class Ejercicio1 {
    public static void main(String[] args) {
     Scanner leer = new Scanner (System.in);
         System.out.println("Elija los numeros para realizar la operacion");
         
            double num1 = leer.nextInt();
            double num2 = leer.nextInt();
            int opcion = 0;
         
    
         do{
                     System.out.println("Menu");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
 
        System.out.println("Elija opcion");
  
        
        
        opcion = leer.nextInt();
        switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + suma( num1, num2));

                    break;
                case 2:
                    System.out.println("La resta es: " + resta(num1,num2));

                    break;
                case 3:
                    System.out.println("La multiplicacion es: " +  mult(num1,num2));
                    break;
                case 4:
                    System.out.println("La division es: " +dividir(num1,num2));
                    break;
                case 5:
                    System.out.println("chau.");
                    break;
     
     
     
                 }
        
               }while(opcion != 5);
     }
         
        public static double suma(double num1, double num2){
             
             double sumar = num1+num2;
             return sumar;
             
         }
         
         public static double resta(double num1, double num2){
             
             double restar = num1-num2;
             return restar;
             
         }
           public static double dividir(double num1, double num2){
             
             double divide = num1/num2;
             return divide;
             
         }
           public static double mult(double num1, double num2){
             
             double mul = num1*num2;
             return mul;
             
         }
    
}

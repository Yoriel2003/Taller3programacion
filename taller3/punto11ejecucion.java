
package taller3;

import java.util.Scanner;


public class punto11ejecucion {
public static void main(String args[])
 {        

 Scanner entrada = new Scanner(System.in);
 int numero;
 punto11 miObjeto = new punto11();


 System.out.println("\nEste programa recibe un entero y lo presenta con los ");
 System.out.println("digitos invertidos. ");
 System.out.println("\nPor favor introduzca un numero: ");
 numero = entrada.nextInt();

 System.out.println("\nEste es el numero invertido:\n ");
 miObjeto.Invierte( numero );

 
 }          
 }
    



package taller3;


import java.util.Scanner;


public class punto4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cont, acum,hem,hr,hrse,hrex,sb;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digitar cantidad de empleados: ");
        cont=leer.nextInt();
        for (int i = 0; i <cont; i++) {
            acum=+1;
            System.out.println("Cantidad de horas del empleado "+ (i+1));
            hem=leer.nextInt();
            System.out.println("Digitar el Precio de la hora:");
            hr=leer.nextInt();
            
            hrse=hem-40;
            hrex= (int)(float)( hrse*hr*1.5);           
            sb= hrex+(40*hr);
            System.out.println("el sueldo bruto es: "+sb);
            
        }
        
        
    }
          
}

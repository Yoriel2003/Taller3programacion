
package taller3;
import java.util.Scanner;

public class punto6decbin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal, modulo, aux;
        String binario="";
        System.out.println("Ingresa numero Decimal");
        decimal=sc.nextInt();
        aux=decimal;
        
        while(decimal > 0){
            modulo = (decimal%2);
            binario = modulo + binario;
            decimal = decimal/2;
            
        }
        System.out.println("El numero binario es: "+ binario);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.Scanner;


public class punto3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
        double pago_semanal=200, ventas, n, b, pago_total;
        
        System.out.println("Digite valor de ventas de la semana: ");
        ventas=sc.nextInt();       
        
        if (ventas>3000 && ventas<5000){
            n=ventas*0.09;
            b=ventas*0.05;
            pago_total=pago_semanal+n+b;
            System.out.println("Su pago es de: "+ pago_total);
            
        
        }else if(ventas>=5000 && ventas<=7000){
            n=ventas*0.09;
            b=ventas*0.07;
            pago_total=pago_semanal+n+b;
            System.out.println("Su pago es de: "+ pago_total);
    
        }else if(ventas>7000 && ventas<10000){
            n=ventas*0.09;
            b=ventas*0.1;
            pago_total=pago_semanal+n+b;
            System.out.println("Su pago es de: "+ pago_total);
       
            
        }else if(ventas>=10000 && ventas<=15000){
            n=ventas*0.09;
            b=ventas*0.1;
            pago_total=pago_semanal+n+b;
            System.out.println("Su pago es de: "+ pago_total);
        
    
        }else if(ventas>15000){
            n=ventas*0.09;
            b=ventas*0.13;
            pago_total=pago_semanal+n+b;
            System.out.println("Su pago es de: "+ pago_total);
        }else{
            n=ventas*0.09;
            pago_total=pago_semanal+n;
            System.out.println("Su pago es de: "+ pago_total);

        }
    
    }
        
}



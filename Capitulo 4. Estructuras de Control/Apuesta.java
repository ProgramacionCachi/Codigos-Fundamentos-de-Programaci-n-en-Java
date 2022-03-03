/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras_Control;

import java.util.Scanner;

/**
 *
 * @author Fernando
 */
public class Apuesta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, r;
        
        System.out.println("Ingresa numero: ");
        numero = entrada.nextInt();
        
        r = (int) Math.sqrt(numero);
        
        System.out.println(r);
    }
    
}

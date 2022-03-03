
package Estructuras_Secuenciales;

import java.util.Scanner;


public class Exponentes {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double exponente, base;
        
        System.out.print("Ingresa la base: ");
        base = entrada.nextDouble();
        System.out.print("Ingresa el exponente: ");
        exponente = entrada.nextDouble();
        
        double resultado;
        
        resultado = Math.pow (base , exponente );
        
        System.out.println("El resultado de " + base + " elevado al exponente " + exponente + " es: " + resultado);
    }
    
}

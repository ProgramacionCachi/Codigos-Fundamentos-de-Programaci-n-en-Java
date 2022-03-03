
package Introduccion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Entrada_B {
    
    public static void main (String [] args) throws IOException{
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        //Declaración de Variables.
        
        int numero_1 = 0, numero_2 = 0;
        int suma, resta, producto, division;
                
        System.out.println("-----------Ingresa los Números------------------");
        System.out.print("\nIngresa el primer número: ");
        numero_1 = Integer.parseInt(entrada.readLine());
        System.out.print("Ingresa el Segundo número: ");
        numero_2 = Integer.parseInt(entrada.readLine());
        
        suma = numero_1 + numero_2;
        resta =  numero_1 - numero_2;
        producto = numero_1 * numero_2;
        division = numero_1 / numero_2;
        
        
        System.out.println("-----------Estos son los Resultados-------------------");
        System.out.println("\nLa suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + producto);
        System.out.println("La división es: " + division);
        
      
        
    }
    
}

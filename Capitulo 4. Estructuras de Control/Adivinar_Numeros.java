
package Estructuras_Control;

import java.util.Scanner;

public class Adivinar_Numeros {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero, numero_aleatorio, intentos = 0;
        
        numero_aleatorio = (int)(Math.random()*100);
        
        do {
            System.out.println("---------------------------------------------------");
            System.out.print("Ingrese un Número: ");
            numero = entrada.nextInt();
            
            if (numero_aleatorio > numero) {
                System.out.println("Ingrese un Número Mayor.");              
            }else{
                System.out.println("Ingrese un Número Menor.");
            }
            intentos ++;
            
        } while (numero != numero_aleatorio);
        
        System.out.println("--------------------------------------------------------");
        System.out.println("\n Haz Adivinado el Número");
        System.out.println("Hiciste " + intentos + " intentos.");
        
    }
    
}

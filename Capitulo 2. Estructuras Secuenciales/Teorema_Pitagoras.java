
package Estructuras_Secuenciales;

import java.util.Scanner;

public class Teorema_Pitagoras {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double hipotenusa, CO, CA;
        
        System.out.print("Ingresa el Cateteo Adyasente: ");
        CA = entrada.nextDouble();
        System.out.print("Ingresa el Cateto Opuesto: ");
        CO = entrada.nextDouble();
        
        hipotenusa = Math.sqrt((CO*CO) + (CA*CA));
               
        System.out.println("La Hipotenusa es: " + hipotenusa);
    }
    
}

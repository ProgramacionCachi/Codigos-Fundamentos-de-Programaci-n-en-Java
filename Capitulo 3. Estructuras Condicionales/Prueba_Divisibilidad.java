
package Estructuras_Condicionales;

import java.util.Scanner;

public class Prueba_Divisibilidad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double resultado, numero1, numero2, division;
        
        System.out.print("Ingresa el Primer Número: ");
        numero1 = entrada.nextDouble();
        System.out.print("Ingresa el Segundo Número: ");
        numero2 = entrada.nextDouble();
        
        resultado = numero1 % numero2;
        division = numero1 / numero2;

    //        System.out.println("La operacion es: " + division);
        
        if ( resultado == 0) {
            System.out.println( numero1 + " es divisible con " + numero2);
            }
    }
}


package Estructuras_Condicionales;

import java.util.Scanner;

public class Mayor_Menor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int numero_1, numero_2;

        System.out.print("Ingresa el primer número: ");
        numero_1 = entrada.nextInt();
        System.out.print("Ingresa el segundo número: ");
        numero_2 = entrada.nextInt();
        
        if ( numero_1 > numero_2) {
            System.out.println( numero_1 + " es el numero mayor");
            System.out.println(numero_2 + " es el numero menor");
         
        }else{
            System.out.println( numero_1 + " es el numero menor");
            System.out.println(numero_2 + " es el numero mayor");
        }
    }
    
}

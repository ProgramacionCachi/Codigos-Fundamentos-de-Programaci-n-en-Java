
package Estructuras_Secuenciales;

import java.util.Scanner;

public class Limitacion_decimales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        //Declarar variables qe ingresara el usuario.
        double resultado_A, resultado_B, n1, n2, n3, n4;
        //Variables Constantes
        final double Pi = Math.PI;
        final double e = Math.E;
        
        System.out.println("---------------Ingresa las Operaciones a Realizar------------------");
        System.out.print("\nIngresa el primer numerador: ");
        n1 = entrada.nextDouble();
        System.out.print("Ingresa el primer denomidador: ");
        n2 = entrada.nextDouble();
        System.out.print("\nIngresa el segundo numerador: ");
        n3 = entrada.nextDouble();
        System.out.print("Ingresa el segundo denomidador: ");
        n4 = entrada.nextDouble();        
        
        resultado_A = n1 / n2;
        resultado_B = n3 / n4;
        
        System.out.println("----------------Los resultados son--------------------------------");
        System.out.println("a) " + n1 + "/" + n2 + " = "  + String.format("%.2f", resultado_A));
        System.out.println("b) " + n3 + "/" + n4 + " = " + String.format("%.2f", resultado_B));
        System.out.println("c) El número Pi es: " + String.format("%.4f", Pi));
        System.out.println("d) El número E es: " + String.format("%.4f", e));
    }
    
}

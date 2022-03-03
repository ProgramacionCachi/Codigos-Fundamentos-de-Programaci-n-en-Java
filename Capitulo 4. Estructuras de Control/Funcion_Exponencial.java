
package Estructuras_Control;

import java.util.Scanner;

public class Funcion_Exponencial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        //final int Veces_Reptir = 10;
        int Veces_Repetir;
        System.out.println("¿cuántas Veces desea realizar la función.");
        System.out.println("ex-x");
        System.out.println("");
        Veces_Repetir = entrada.nextInt();

        
        for (int i = 1; i <= Veces_Repetir; i++) {
            System.out.println("------------------------------------------------");
            double x, resultado;
            System.out.print("Ingres el valor de X: ");
            x = entrada.nextDouble();
            
            resultado = Math.exp(2*x) - x;
            
            System.out.println("f(" + x + ") = " + resultado);
            System.out.println("------------------------------------------------");
        }
    }
    
}

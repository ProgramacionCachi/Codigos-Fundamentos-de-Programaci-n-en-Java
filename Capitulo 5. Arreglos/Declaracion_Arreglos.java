
package Arreglos;

import java.util.Scanner;

public class Declaracion_Arreglos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num, cantidad; // Declaración de Variables.
        
        System.out.println("----------------------------------------------------");
        System.out.print("Ingresar Números: ");
        num = entrada.nextInt();
        System.out.println("----------------------------------------------------");
        
        int [] numeros = new int [num];
        
        for (int i = 0; i < num; i++) { // Bucle para la entrada de datos de nuestro Array.
            System.out.print((i +1 )+". Ingresa un número: ");
            numeros [i] = entrada.nextInt();
        }
        System.out.println("----------------------------------------------------");
        System.out.print("\nLos números del Array son: "); //Bucle es para la salida de datos del Array
        for (int i = 0; i < num; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }
    
}

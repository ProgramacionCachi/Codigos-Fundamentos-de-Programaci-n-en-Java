
package Estructuras_Control;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int Numero;
        
        System.out.println("-----------------------------------------------------------");
        System.out.print("Ingrese el número a contar: ");
        Numero= entrada.nextInt();
        System.out.println("------------------------------------------------------------");
                
        int contador = 0;
        
        while(contador < Numero){
            contador ++;
            System.out.println(contador + ", ");
            
        }
    }
    
}

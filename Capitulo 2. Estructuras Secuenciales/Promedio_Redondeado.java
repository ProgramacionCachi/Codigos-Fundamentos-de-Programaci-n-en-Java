
package Estructuras_Secuenciales;

import java.util.Scanner;

public class Promedio_Redondeado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double administracion, cultura, contabilidad, promedio;
        
        System.out.println("------------------Ingresa las calificaciones-----------------");
        System.out.print("\nTaller de Administración: ");
        administracion = entrada.nextDouble();
        System.out.print("Cultura Empresarial: ");
        cultura = entrada.nextDouble();
        System.out.print("Contabilidad Financiera: ");
        contabilidad = entrada.nextDouble();
        
        promedio = (administracion + cultura + contabilidad) / 3;
        
        System.out.println("\n----------------El Promedio Final-----------------------");
        System.out.print("El promedio final es: " + Math.round(promedio));
        
    }
  
    
}

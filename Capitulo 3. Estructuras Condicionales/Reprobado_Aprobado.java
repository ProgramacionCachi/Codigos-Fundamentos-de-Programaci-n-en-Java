
package Estructuras_Condicionales;

import java.util.Scanner;

public class Reprobado_Aprobado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        double SO, AL, CV, G, PROMEDIO;
        System.out.println("---------------------Ingresa las Calificaciones--------------------------");
        System.out.print("\nSistemas Operativos: ");
        SO = entrada.nextDouble();
        System.out.print("Álgebra Lineal: ");
        AL = entrada.nextDouble();
        System.out.print("Cálculo Vectorial: ");
        CV = entrada.nextDouble();
        System.out.print("Graficación: ");
        G = entrada.nextDouble();
        System.out.println("-----------------------------------------------------------------------");
        
        PROMEDIO = (SO + AL + CV + G) / 4;
        
        if ( PROMEDIO >= 7) {
            System.out.println("La dalificación es: " + String.format("%.2f", PROMEDIO));
            System.out.println("El Alumno esta Aprobado");
        }else{
            System.out.println("La calificación es: " + String.format("%.2f", PROMEDIO));
            System.out.println("El Alumno esta Reprobado");
        }
    }
    
}

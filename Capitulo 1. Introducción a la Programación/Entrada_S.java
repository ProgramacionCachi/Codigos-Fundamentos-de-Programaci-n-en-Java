
package Introduccion;
import java.util.Scanner;

public class Entrada_S {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        //Declaración de Variables.
        double promedio;
        double ing_sof, redes, fun_prog, simulacion, calculo, arqui_compu;
        
        // Leyendas para ingresos de datos.
        System.out.println("--------Calificaciones del Semestre-----------------");
        System.out.print("\nIngresa la calificación de Ingeniería de Software: ");
        ing_sof = entrada.nextDouble();
        System.out.print("\nIngresa la calificación de Redes de Computadoras: ");
        redes = entrada.nextDouble();
        System.out.print("\nIngresa la calificación de Fundamentos de Programación: ");
        fun_prog = entrada.nextDouble();
        System.out.print("\nIngresa la calificación de Silulación: ");
        simulacion = entrada.nextDouble();        
        System.out.print("\nIngresa la calificación de Cálculo Diferencial e Integral: ");
        calculo = entrada.nextDouble();
        System.out.print("\nIngresa la calificación de Arquitectura de Computadoras: ");
        arqui_compu = entrada.nextDouble();        
        
        
        promedio = (ing_sof + redes + fun_prog + simulacion + calculo + arqui_compu)/6;
        
        System.out.println("-------------El Promedio del Semestre------------------");
        System.out.println("El promedio es: " + promedio);
        
    }
    
}

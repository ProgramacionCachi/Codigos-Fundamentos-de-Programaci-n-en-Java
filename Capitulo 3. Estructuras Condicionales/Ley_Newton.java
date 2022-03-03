package Estructuras_Condicionales;

import java.util.Scanner;

public class Ley_Newton {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char opcion;
        double fuerza, masa, aceleracion;

        System.out.println("----------------------------------------------------------------");
        System.out.println("\nSelecciones una opción:");
        System.out.println("Fuerza (F)");
        System.out.println("Masa (m)");
        System.out.println("Aceleración (a)");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("\n¿Qué opción desea?");
        opcion = entrada.next().charAt(0);

        switch (opcion) {
            case 'F':
            case 'f':
                System.out.println("\nQuiere calcular la Fuerza");
                System.out.print("Ingrese la masa: ");
                masa = entrada.nextDouble();
                System.out.print("Ingrese la aceleración: ");
                aceleracion = entrada.nextDouble();

                fuerza = masa * aceleracion;

                System.out.println("La fuerza es: " + fuerza + " N");
                break;
            case 'M':
            case 'm':
                System.out.println("\nQuiere calcular la masa");
                System.out.print("Ingrese la fuerza: ");
                fuerza = entrada.nextDouble();
                System.out.print("Ingrese la aceleración: ");
                aceleracion = entrada.nextDouble();

                masa = fuerza / aceleracion;

                System.out.println("La masa es: " + masa + " kg");
                break;
            case 'A':
            case 'a':
                System.out.println("\nQuiere calcular la aceleración");
                System.out.print("Ingrese la fuerza: ");
                fuerza = entrada.nextDouble();                
                System.out.print("Ingrese la masa: ");
                masa = entrada.nextDouble();
                
                aceleracion = fuerza / masa;
                
                System.out.println("La aceleración es: " + aceleracion);
                break;
            default:
                System.out.println("Esta opción no se encuentra, ya que la forumla\n solo cuenta con tres opciones");
        }
    }

}

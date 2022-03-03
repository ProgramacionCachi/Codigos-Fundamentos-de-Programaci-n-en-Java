package Estructuras_Condicionales;

import java.util.Scanner;

public class Etapas_Persona {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nombre;
        int edad;

        System.out.println("---------------Ingrese sus datos-------------------------");
        System.out.print("\nIngrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("----------------------------------------------------------");

        if (edad <= 2) {
            System.out.println(nombre + " es un bebé");
        } else if (edad <= 13) {
            System.out.println(nombre + " es un niño");
        } else if (edad <= 17) {
            System.out.println(nombre + " es un adolescente");
        } else if (edad <= 35) {
            System.out.println(nombre + " es un aulto joven");
        } else if (edad <= 64) {
            System.out.println(nombre + " es un adulto");

        } else if (edad <= 150) {
            System.out.println(nombre + " es una persona de la tercera edad");
        } else {
            System.out.println("Esta persona sobre pasa el promedio de vida de una persona.");
        }
    }
}

package Arreglos;

import java.util.Scanner;

public class Palabras {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 0;

        System.out.println("----------------------------------------------------");
        System.out.print("Ingrese una palabra: ");
        String palabra = entrada.nextLine();
        System.out.println("----------------------------------------------------");

        char caracteres[] = new char[palabra.length()]; //Declración de Array.

        for (int i = 0; i < palabra.length(); i++) { // Bucle for es para procesamiento de datos.
            contador = contador + 1; // Contador de caracteres.
            caracteres[i] = palabra.charAt(i); // Ingreso o relleno de datos del Array
            System.out.println(caracteres[i]); // Salida de datos del Array        }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("La cantidad de caracteres de la palabra es: " + contador);
    }

}

package Arreglos;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int Matriz[][]; //Declaración Variable de Array Multidimensional.
        int Filas, Columnas; //Declaración de Variables.

        System.out.println("----------------------------------------------------");
        System.out.print("Ingrese el Número de Filas del Array: ");
        Filas = entrada.nextInt();
        System.out.print("Ingrese el Número de Columnas del Array: ");
        Columnas = entrada.nextInt();
        System.out.println("----------------------------------------------------");

        Matriz = new int[Filas][Columnas]; //  Declaración de Array Multidimensional.

        System.out.println("\nNúmeros de la Matriz: ");
        for (int i = 0; i < Filas; i++) { //Bucle For Anidado es para la Entradade Datos.
            for (int j = 0; j < Columnas; j++) { // Entrada de Filas y Columnas del Array.
                System.out.print("Array [" + i + "]" + "[" + j + "]: ");
                Matriz[i][j] = entrada.nextInt(); // Relleno del Array.

            }

        }
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < Filas; i++) { // Bucle For Anidado para la Salida de Datos
            for (int j = 0; j < Columnas; j++) {
                System.out.print(Matriz[i][j]);

            }
            System.out.println(" "); // Sepación.

        }
        System.out.println("----------------------------------------------------");
    }

}

package Arreglos;

import java.util.Scanner;

public class Array_Multidimensional_Escalonado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaración de Variables
        int Columnas, Filas;
        System.out.print("Ingrese las Columnas: ");
        Columnas = entrada.nextInt();
        System.out.print("Ingrese las Filas: ");
        Filas = entrada.nextInt();

        //Declaración del Array Multidimensional o Matriz.
        int[][] matriz = new int[Filas][Columnas];

        //Bucle for Anidado
        for (int i = 0; i < Filas; i++) { // Bucle de creación de filas
            for (int j = 0; j < Columnas; j++) { // Bucle ´para creacón de columnas.
                for (int k = 0; k < matriz.length; k++) { // Bucle para la diagonal
                    if (i == k || Filas - 1 == j || j == k) {
                        matriz[i][j] = k + 1;

                    }

                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

}

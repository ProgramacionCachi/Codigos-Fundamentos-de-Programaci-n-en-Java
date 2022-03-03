package Arreglos;

import java.util.Scanner;

/**
 * Elaboró Fernando López Martínez.
 */
public class Arreglos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int columna, fila;

        System.out.println("Columnas:");
        columna = entrada.nextInt();
        System.out.println("Filas: ");
        fila = entrada.nextInt();

        int[][] matriz = new int[fila][columna];

        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                for (int k = 0; k < matriz.length; k++) {
                    if (i == k || fila - 1 == j || j == k) {
                        matriz[i][j] = k + 1;

                    }

                }
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }

    }
}

package Arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz_ {

    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        char matriz[][][];
        int Filas, Caras, Columnas;
        char L = 'L';
        char f = '0';

        System.out.print("Ingrese el tamaño de filas ");
        Filas = Integer.parseInt(entrada.readLine());

        System.out.print("Ingrese las Columnas: ");
        Columnas = Integer.parseInt(entrada.readLine());

        System.out.print("Ingrese las caras: ");
        Caras = Integer.parseInt(entrada.readLine());

        matriz = new char[Filas][Caras][Columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = 0; j < Caras; j++) {
                for (int k = 0; k < Columnas; k++) {
                    if (i == Filas || k == 0) {
                        matriz[i][j][k] = L;
                    } else if (i == Filas - 1 || j == Caras) {
                        matriz[i][j][k] = L;
                    } else {
                        matriz[i][j][k] = f;
                    }
                    System.out.print("[" + matriz[i][j][k] + "]");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}

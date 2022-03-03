package Arreglos;

import java.util.Scanner;

public class Array_Tridimensional {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char matriz[][][]; // Declaració de matriz
        int x1, x2, x3; // Declaración de variables
        char r = 'L'; // Relleno de la L
        char f = '0'; // Relleno de la demaás matriz

        System.out.println("filas: "); // Entradas de ddatos
        x1 = entrada.nextInt();
        System.out.println("columnas: ");
        x2 = entrada.nextInt();
        System.out.println("caras: ");
        x3 = entrada.nextInt();
 
        matriz = new char[x1][x2][x3]; // Creación de la Matriz con tres dimensiones.

        for (int i = 0; i < x1; i++) { // for para filas
            for (int j = 0; j < x3; j++) { // for para caras
                for (int k = 0; k < x2; k++) {//fot para columaas
                    if (i == x1 || k == 0) { //condicional del verdadero
                        matriz[i][j][k] = r; //rama del verdadero
                    } else if (i == x1 - 1 || j == x3) { // si no se cumple realiza otro if
                        matriz[i][j][k] = r; // impresion del verdadero con la matriz
                    } else { // de los contrario imprime la matriz a como la interpreta.
                        matriz[i][j][k] = f; // impresionde la matriz
                    }
                    System.out.print("[" + matriz[i][j][k] + "]"); // imresion delos datos de la matriz
                }
                System.out.print(" "); // sepación de datos de la matriz
            }
            System.out.println(" "); // separación de datods de la matriz
        }
    }
}

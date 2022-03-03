package Arreglos;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz_Diagonal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int Filas, Columnas; 
        int numero = 0;

        
        System.out.print("Ingresa las Columnas: ");
        Columnas = entrada.nextInt();
        System.out.print("Ingresalas Filas: ");
        Filas = entrada.nextInt();

        //Declaración del Array.
        int[][] matriz  = new int[Filas][Columnas];
        int Diagonal;
        numero ++;
        
        //El relleno de la diagonal es 1.
        for (Diagonal = numero ++; Diagonal  < matriz.length ; Diagonal++) {
            matriz [Diagonal][Diagonal] = numero ++; // BucleFor es para la Diagonal de la Matriz
            
        }
        //Mostrar las filas del Array. Usar la libreria Arrays.
        for (Diagonal = 0; Diagonal < matriz.length; Diagonal++) {
            System.out.println(Arrays.toString(matriz[Diagonal]));
            
        }
        
    }
    
}

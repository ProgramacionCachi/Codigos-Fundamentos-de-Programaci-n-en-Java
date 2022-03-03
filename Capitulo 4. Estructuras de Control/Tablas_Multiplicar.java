package Estructuras_Control;

import java.util.Scanner;

public class Tablas_Multiplicar {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        final int Numero_Multplicar = 10;
        int Numero_base;

        System.out.println("-----------------------------------------------------");
        System.out.print("¿Qué tabla de multiplicar desea saber? ");
        Numero_base = entrada.nextInt();
        System.out.println("-----------------------------------------------------");

        for (int i = Numero_base; i <= Numero_base; i++) {
            System.out.println("Tabla de Multiplicar del Número: " + i);
            for (int j = 1; j <= Numero_Multplicar; j++) {
                System.out.println(i + " X " + j + " = " + i * j);

            }
        }
    }

}

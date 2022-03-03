package Estructuras_Control;

import java.util.Scanner;

public class Acomulador {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de Variables
        int acomulador, cantidad = 0, piezas;
        float largo_pieza;
        acomulador = 1;
        System.out.println("------------------------------------------------");
        System.out.print("\n¿Cuántas piezas desea procesar? ");
        piezas = entrada.nextInt();
        System.out.println("------------------------------------------------");

        while (acomulador <= piezas) {
            System.out.print("\nIngrese la medida de la pieza: ");
            largo_pieza = entrada.nextFloat();

            if (largo_pieza >= 1.20 && largo_pieza <= 1.30) {
                cantidad++;
            }
            acomulador = acomulador + 1;
        }
        System.out.println("-------------------------------------------------");
        System.out.println("\nLa cantidad de piezas apatas son: " + cantidad);
    }

}

package Arreglos;

import java.util.Scanner;

public class Conteo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] numeros = new int[10];
        int positivos = 0, negativos = 0, ceros = 0;

        //Lectura de datos ingresadoso Entrada de datos.
        System.out.println("Ingrese los números del Arreglo. ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numeros: [" + i + "]: ");
            numeros[i] = entrada.nextInt();

        }
        //Salida de datos.
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                positivos = positivos + 1;
            } else if (numeros[i] < 0) {
                negativos = negativos + 1;
            } else {
                ceros++;
            }

        }
        // Salida de datos contados.
        System.out.println("----------------------------------------------------");
        System.out.println("Números Positivos: " + positivos);
        System.out.println("Números Negativos: " + negativos);
        System.out.println("Números Nulos: " + ceros);
        System.out.println("----------------------------------------------------");
    }

}

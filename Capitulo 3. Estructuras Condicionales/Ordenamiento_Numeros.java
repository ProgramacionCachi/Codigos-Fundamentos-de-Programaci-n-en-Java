package Estructuras_Condicionales;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ordenamiento_Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int arreglo[], numeros, positivo, auxiliar;
        
        numeros = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números vas a ordenar?"));

        arreglo = new int[numeros];

        System.out.println("Números a Ordenar: ");
        for (int i = 0; i < numeros; i++) {
            System.out.print((i + 1) + ". Digite un número: ");
            arreglo[i] = entrada.nextInt();
        }
        //Ordenamiento por Mezcla Natural

        for (int i = 0; i < numeros; i++) {
            positivo = i;
            auxiliar = arreglo[i];

            while ((positivo > 0) && (arreglo[positivo - 1] > auxiliar)) {
                arreglo[positivo] = arreglo[positivo - 1];
                positivo--;
            }
            arreglo[positivo] = auxiliar;
        }

        //imprimir resultados.
        System.out.print("\nOrden Ascendente: ");
        for (int i = 0; i < numeros; i++) {
            System.out.print(arreglo[i] + " - ");

        }
        System.out.println("");

        System.out.print("Orden Descendete: ");
        for (int i = (numeros - 1); i >= 0; i--) {
            System.out.print(arreglo [i] + " - ");

        }
        System.out.println("");

    }

}

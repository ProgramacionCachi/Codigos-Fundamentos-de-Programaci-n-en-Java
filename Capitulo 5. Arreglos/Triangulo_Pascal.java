package Arreglos;

public class Triangulo_Pascal {

    public static void main(String[] args) {

        int nFilas = 10; // Declaración de Filas.
        int[] triangulo = new int[1]; //Declaración de Variable Array.

        for (int i = 1; i <= nFilas; i++) { // Bucle de entrada de datos.
            int[] x = new int[i]; // Arreglo de Relleno

            for (int j = 0; j < i; j++) { // Bucle para salida de datos.
                if (j == 0 || j == (i - 1)) {
                    x[j] = 1;

                } else {
                    x[j] = triangulo[j] + triangulo[j - 1]; // Ordenamiento del Triangulo.
                }
                System.out.print(x[j] + " ");
            }
            triangulo = x;
            System.out.println();
        }
    }

}

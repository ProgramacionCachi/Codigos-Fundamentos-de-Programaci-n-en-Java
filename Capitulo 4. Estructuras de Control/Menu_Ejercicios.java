package Estructuras_Control;

import java.util.Scanner;

public class Menu_Ejercicios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int reptir;

        do {
            int opcion; //Variable es condicional para el Switch.
            System.out.println("Selecciona una opcion: ");
            System.out.println("1. Suma y Resta de Numeros.");
            System.out.println("2. Número de Digitos de un Número.");
            System.out.print(" ¿Qué Opción desea? ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-----------------------------------------------");
                    System.out.println("1. Suma y Resta de Numeros.");
                    System.out.println("\nLa suma se realizara una vez ingresando cero.");
                    int numero;
                    int suma = 0;
                    int resta = 0;

                    do {
                        System.out.print("Ingrese un número: ");
                        numero = entrada.nextInt();

                        suma += numero;
                        resta -= numero;

                    } while (numero != 0);
                    System.out.println("La suma es: " + suma);
                    System.out.println("La resta es: " + resta);
                    break;

                case 2:
                    System.out.println("-----------------------------------------------------");
                    System.out.println("2. Número de Digitos de un Número.");
                    int valor = 0;
                    
                    do {
                        System.out.println("Ingrese un valor entre 0 y 999 (0 finaliza).");
                        valor = entrada.nextInt();
                        if (valor >= 100) {
                            System.out.println("Es de 3 digitos. ");
                        } else {
                            if (valor >= 10) {
                                System.out.println("Es de 2 digitos.");

                            } else {
                                System.out.println("Es de 1 digito.");
                            }
                        }

                    } while (valor != 0);
                    break;
                default:
                    System.out.println("Esa opción no se encuntra en el menú.");

            }
            System.out.println("-----------------------------------------------------------");
            System.out.println("¿Gusta realizar una opción más? ");
            System.out.println("1. Sí.");
            System.out.println("2. No.");
            System.out.println("");
            reptir = entrada.nextInt();

        } while (reptir == 1);
        System.out.println("----------------------------------------------------------------");
        System.out.println("Fin del Menu.");
    }

}

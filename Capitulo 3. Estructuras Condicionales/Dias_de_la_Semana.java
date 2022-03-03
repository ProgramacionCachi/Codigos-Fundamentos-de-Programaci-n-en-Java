
package Estructuras_Condicionales;

import java.util.Scanner;

public class Dias_de_la_Semana {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int dias;
        
        System.out.println("-----------------------------------------------------");
        System.out.print("\nIngrese el número del día de la semana: ");
        dias = entrada.nextInt();
        System.out.println("------------------------------------------------------");
        
        switch (dias){
            case 1:
                System.out.println("El primer día de la semana es Domingo");
                break;
            case 2:
                System.out.println("El segundo día de la semana es Lunes");
                break;
            case 3:
                System.out.println("El tercer día de la semana es Martes");
                break;
            case 4:
                System.out.println("El cuarto día de la semana es Miércoles");
                break;
            case 5:
                System.out.println("El quinto dia de la semana es Jueves");
                break;
            case 6:
                System.out.println("El sexto día de la seman es Viernes");
                break;
            case 7:
                System.out.println("El último día de la semana es Sábado");
                break;
            default:
                System.out.println("Solamente hay siete días en la semana");
                break;
                
        }
    }
    
}


package Estructuras_Condicionales;

import java.util.Scanner;

public class Festividades_Meses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        int mes;
        
        System.out.println("----------------------------------------------------------");
        System.out.print("\nIngrese el número del mes:" );
        mes = entrada.nextInt();
        System.out.println("\n---------------------------------------------------------");
        
        switch (mes){
            case 1:
                System.out.println("Es el mes de Enero");
                System.out.println("Inicio del Año");
                System.out.println("Dí de Reyes Magos");
                break;
            case 2:
                System.out.println("Es el mes de Febrero");
                System.out.println("Día de la Constitución Mexicana.");
                System.out.println("Día de los Enamorados");
                break;
            case 3:
                System.out.println("Es el mes de Marzo");
                System.out.println("Día del Aniversario de Benito Juárez");
                break;
            case 4:
                System.out.println("Es el mes de Abril");
                System.out.println("Semana Santa");
                System.out.println("Día del niño.");
                break;
            case 5:
                System.out.println("Es el mes de Mayo");
                System.out.println("Día del tabajo");
                System.out.println("Aniversario de la Batalla de Puebla");
                System.out.println("Día del Maestro");
                System.out.println("Día de la mamá");
                break;
            case 6:
                System.out.println("Es el mes de Junio");
                System.out.println("Día del papá");
                break;
            case 7:
                System.out.println("Es el mes de Julio");
                System.out.println("Día del abuelo");
                break;
            case 8:
                System.out.println("Es el mes de Agosto");
                System.out.println("Regreso a clase o inicio de ciclo escolar");
                break;
            case 9:
                System.out.println("Es el mes de Septiembre");
                System.out.println("Día de Aniversario de la Independencia de México");
                break;
            case 10:
                System.out.println("Es el mes de Octubre");
                System.out.println("Día de la Raza");
                break;
            case 11:
                System.out.println("Es el mes de Noviembre");
                System.out.println("Día de Muertos");
                System.out.println("Día de aniversario de la Revolución Mexicana");
                break;
            case 12:
                System.out.println("Es el mes de Diciembre");
                System.out.println("Día de la Virgen de Guadalupe");
                System.out.println("Noche Buena");
                System.out.println("Navidad");
                System.out.println("Día de los Inoscentes");
                System.out.println("Fin de Año");
                break;
            default:
                System.out.println("Solamente hay 12 meses al año");
                break;
        }
    }
    
}

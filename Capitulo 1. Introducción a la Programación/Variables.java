
package Introduccion;


public class Variables {
    
    public static void main(String[] args) {
        
        // Declaración de Variables.
        
        //Variables Booleans.
        
        boolean verdadero = true;
        boolean Falso = false;
        
        // Variables de Tipo Numérico Entero.
        
        byte numero_byte = 25;
        short numero_short = 10;
        int numero_int = 79;
        long numero_long = 8;
        
        // Variables de tipo Caracater.
        char Primera_letra_de_esta_variable = 'R';
        
        // Variable de tipo Numérico pero Decimal.
 
        double numero_double = 2.10;
               
        float numero_float = 3.14f;
        //Variable de Cadena de Texto
        
       
        String nombre = "Roberto";
       
        //Estas son salidas de datos.
        
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Roberto tiene " + numero_byte + " años");
        System.out.println("¿Roberto es mujer? " + Falso);
        System.out.println("¿Cuántos años tiene el papá de Roberto" + numero_int + " años");
        System.out.println("Roberto tiene un hijo " + verdadero);
        System.out.println("Su hijo tiene " + numero_short + " meses");
        System.out.println("Su número de la suerte es: " + numero_long);
        System.out.println("La priemera letra de su nombre es: " + Primera_letra_de_esta_variable);
        System.out.println("Roberto mide: " + numero_double + "m");
        System.out.println("El valor de Pi es: " + numero_float);
        
    }
    
}

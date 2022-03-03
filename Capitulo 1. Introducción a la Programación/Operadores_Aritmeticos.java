
package Introduccion;

public class Operadores_Aritmeticos {
    
    public static void main(String[] args) {
        //Declaramos Variables
        int numero1 = 7, numero2 = 2, resultado_suma, resultado_resta, resultado_producto, resultado_division, resultado_modulo;
        
        //Operador suma
        resultado_suma = numero1 + numero2;
        System.out.println("La suma es: " + resultado_suma);
        
        //Operador resta
        resultado_resta = numero1 - numero2;
        System.out.println("La resta es: " + resultado_resta);
        
        //Operador producto.
        resultado_producto = numero1 * numero2;
        System.out.println("La multiplicación es: " + resultado_producto);
        
        //Operador División
        resultado_division = numero1 / numero2;
        System.out.println("La divisón es: " + resultado_division);
        
        //Operador Modulo.
        
        resultado_modulo = numero1 % numero2;
        System.out.println("El modulo o restante de nuestra divisón anterior es: " + resultado_modulo);
        
    }
    
}


package Estructuras_Condicionales;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        final double usuario = 200816;
        final double contraseña = 12345;
        
        double ingresa_usuario, ingresa_contraseña;
        
        System.out.println("--------------LOGIN-------------------");
        System.out.print("\nIngresa el usuario: ");
        ingresa_usuario = entrada.nextDouble();
        System.out.print("Ingresa la contraseña: ");
        ingresa_contraseña = entrada.nextDouble();
        
        System.out.println("\n------------------------------------------");
        
        if ( usuario == ingresa_usuario && contraseña == ingresa_contraseña) {
            System.out.println("BIENVENIDO " + usuario);
            }else{
            System.out.println("Usuario o Contraseña son Incorrectos");
        }
    }
    
}


package Estructuras_Secuenciales;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area_Rectangulo {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
        
        int area, base, altura;
        
        System.out.print("Ingresa la base: ");
        base = Integer.parseInt(entrada.readLine());
        System.out.print("Ingresa la altura: ");
        altura = Integer.parseInt(entrada.readLine());        
        
        area = base * altura;
        
        System.out.println("El área es: " + area);
        
        
        
    }
    
}

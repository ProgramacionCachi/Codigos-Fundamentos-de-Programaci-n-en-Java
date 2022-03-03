
package Introduccion;

import javax.swing.JOptionPane;

public class Entrada_JOP {
    public static void main(String[] args) {
        //Declarar Variables.
        String nombre;
        char letra;
        int edad;
        double altura;
        
        nombre = JOptionPane.showInputDialog ("Ingrese su nombre: ");
        letra= JOptionPane.showInputDialog("Ingresa la primer letra de tu nombre: ").charAt(0);
        edad = Integer.parseInt(JOptionPane.showInputDialog ("Ingresa tu edad: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog ("¿Cuánto Mide?: "));
        
        JOptionPane.showMessageDialog( null, "¡Hola!, " + nombre);
        JOptionPane.showMessageDialog( null, "La primer letra de su nombre es: " + letra);
        JOptionPane.showMessageDialog( null, "Tienes " + edad + " años");
        JOptionPane.showMessageDialog( null, "Mide: " + altura);
        
    }
    
}

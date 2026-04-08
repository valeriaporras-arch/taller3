/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expclases;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        String correo = JOptionPane.showInputDialog("Ingrese el correo");
        float edad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la edad"));
        
        Estudiante est1= new Estudiante(nombre, correo, edad);
        
        
        JOptionPane.showMessageDialog(null, "Datos regisrados: \n" + est1);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import javax.swing.JOptionPane;

/**
 *
 * @author UIS
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio3();
        
    }

    public static void prueba() {

        String[] opciones = {"Saludar", "Despedir", "Salir"};
        int x = JOptionPane.showOptionDialog(null, "seleccione", "menu", 1, JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
        // (..., mensaje, titulo ventana, vista mensaje(maso), icono ventana,... , nom boton, ...)
        System.out.println("x: " + x);
    }


    /*1. Escriba un programa que muestre un menú ofreciendo las siguientes opciones.
1-     saludar
2-     despedirse
3-     salir*/
    public static void ejercicio1() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                MENU DE OPCIONES 
                                                1.Saludar
                                                2.Despedir
                                                3.Salir"""));

        switch (opcion) {

            case 1:
                JOptionPane.showMessageDialog(null, "Holasss");
            case 2:
                JOptionPane.showMessageDialog(null, "Bayy");
            case 3:
                JOptionPane.showMessageDialog(null, "Salirendo del sistema");

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opccion inexistente");
                throw new AssertionError();
        }

        /* JOptionPane.showOptionDialog(parentComponent, opciones, title, 0, 0, icon, opciones, opciones)
       
        String[] opciones = {"Saludar", "Despedir", "Salir"};
        int opcion= JOptionPane.showOptionDialog(null, "¿Que deseas hacer?", "Menu", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones,opciones[]);
         */
    }

    /*2.      Programa que muestre un menú ofreciendo las siguientes opciones.
1.      Calcular área del cuadrado
2.      Calcular área del  círculo
3.      Calcular área del  triángulo.
4.      Calcular área del rectángulo.
5.      Salir.*/
    public static void ejercicio2() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                MENU DE OPCIONES 
                                                1. Calcular área del cuadrado
                                                2. Calcular área del  círculo
                                                3. Calcular área del  triá1ngulo.
                                                4. Calcular área del rectángulo.
                                                5. Salir."""));

        switch (opcion) {
            case 1:
                JOptionPane.showConfirmDialog(null, "Usted a seleccionado calcular el área del cuadrado");
                double lado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de los lados"));
                double area1 = lado * lado;
                JOptionPane.showConfirmDialog(null, "el area de su cuadrado es : " + area1);
            case 2:
                JOptionPane.showConfirmDialog(null, "Usted a seleccionado calcular el área del círculo");
                double rad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida del radio"));
                double area2 = Math.PI * (rad * rad);
                JOptionPane.showConfirmDialog(null, "el area de su círciulo es : " + area2);
            case 3:
                JOptionPane.showConfirmDialog(null, "Usted a seleccionado calcular el área del triá1ngulo");
                double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la base"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la altura"));
                double area3 = (base * altura) / 2;
                JOptionPane.showConfirmDialog(null, "el area de su triá1ngulo es : " + area3);
            case 4:
                JOptionPane.showConfirmDialog(null, "Usted a seleccionado calcular el área del rectángulo");
                base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la base"));
                altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la medida de la altura"));
                double area4 = (base * altura);
                JOptionPane.showConfirmDialog(null, "el area de su triá1ngulo es : " + area4);
            case 5:
                JOptionPane.showConfirmDialog(null, "Usted a seleccionado salir del sistema");

                break;
            default:
                JOptionPane.showMessageDialog(null, "Opccion inexistente");
                throw new AssertionError();
        }
    }

    /*3.      Desarrolle un algoritmo muestre un menú con las siguientes opciones:
1. Registrar notas (cada estudiante tiene un nombre y tres notas matemáticas, inglés, español).
2. Calcular promedio por materia
3. Calcular promedio total del curso.
4. Mostrar los estudiantes aprobados y los reprobados.
5. salir*/
    public static void ejercicio3() {
        String[] opciones = {"Registrar", "Promedio Materia", "Promedio curso", "aprobados y reprobados", "Salir"};
        double x = JOptionPane.showOptionDialog(null, "Seleccione una opción", "menu", 1, JOptionPane.INFORMATION_MESSAGE, null, opciones, 0);
        
        switch (x) {
            case 0:
                
                break;
            default:
                throw new AssertionError();
        }
    }
/*4.      Realice un algoritmo en el que se creen dos listas.
    La primera contiene nombres de personas y la segunda contiene los sexos de las personas de la primera lista,
    codificados como ´f´ (femenino) y ´m´ (masculino).
    Dichos valores deben ser solicitados al usuario.
    Obtener a partir de las dos listas otras dos,
    la primera de los cuales debe contener todos los nombres de los varones y la segunda, el nombre de todas las mujeres.
*/
}

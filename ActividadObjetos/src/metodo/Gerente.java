/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Gerente extends Empleado{
    String titutloProfesional;

    public Gerente(String titutloProfesional, int idEmpleado, String nombres, String apellidos, String telefono, String direccion) {
        super(idEmpleado, nombres, apellidos, telefono, direccion);
        this.titutloProfesional = titutloProfesional;
    }
    public void gestionarEmpleados(){
    
    }
    public void generarReportes(){
    
    }

    @Override
    public void realizarTarea() {
         System.out.println("Estoy realizando tarea como gerente.");
    }
}

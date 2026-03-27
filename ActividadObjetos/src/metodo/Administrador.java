/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Administrador extends Empleado {
    int empleadosAcargo;

    public Administrador(int empleadosAcargo, int idEmpleado, String nombres, String apellidos, String telefono, String direccion) {
        super(idEmpleado, nombres, apellidos, telefono, direccion);
        this.empleadosAcargo = empleadosAcargo;
    }
    
    
    
    public void registrarProductos(){
    
    }
    public void registrarCompras(){
    
    }
    public void gestionarVentas(){
    
    }

    @Override
    public void realizarTarea() {
        System.out.println("Estoy realizando una tarea como Administrador.");
    }
}

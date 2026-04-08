/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Vendedor extends Empleado {
    int añosExperiencia;

    public Vendedor(int añosExperiencia, int idEmpleado, String nombres, String apellidos, String telefono, String direccion) {
        super(idEmpleado, nombres, apellidos, telefono, direccion);
        this.añosExperiencia = añosExperiencia;
    }
    public void registrarVentas(){
    
    }

    @Override
    public void realizarTarea() {
        System.out.println("Estoy realizando una tarea como vendedor");
    }
}

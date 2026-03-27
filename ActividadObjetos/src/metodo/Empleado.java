/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public abstract class Empleado {
    protected int idEmpleado;
    protected String nombres;
    protected String apellidos;
    protected String telefono;
    protected String direccion;

    public abstract void realizarTarea();
    
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Empleado(int idEmpleado, String nombres, String apellidos, String telefono, String direccion) {
        this.idEmpleado = idEmpleado;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }
}

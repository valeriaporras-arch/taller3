/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcestudiantes.model;

/**
 *
 * @author UIS
 */
public class Estudiante {
    
    private int idEst;
    private String nombre;
    private String apellido;
    private double promedio;

    public Estudiante() {
    }
    
    

    public Estudiante(int idEst, String nombre, String apellido, double promedio) {
        this.idEst = idEst;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public int getIdEst() {
        return idEst;
    }

    public void setIdEst(int idEst) {
        this.idEst = idEst;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Estiudiante{" + "idEst=" + idEst + ", nombre=" + nombre + ", apellido=" + apellido + ", promedio=" + promedio + '}';
    }
    
    
    
}

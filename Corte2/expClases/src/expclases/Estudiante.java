/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expclases;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Estudiante {

    String nombre;
    String correo;
    float edad;
    List<Materia> materias;

    public Estudiante(String nombre, String correo, float edad, List<Materia> materias) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.materias = materias;
    }

    public Estudiante(String nombre, String correo, float edad) {
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + "\nCorreo: " + correo
                + "\nEdad: " + edad;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcestudiantes.model;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author UIS
 */
public class EstudianteDAO {
    
    private static List<Estudiante> listaEstudiantes = new ArrayList<>();
    
    //METODO Crear (registrar)
    public boolean guardar(Estudiante est){
        try {
            return listaEstudiantes.add(est);
        } catch (Exception e) {
            System.err.print("Error al guardar: " + e.getMessage());
            return false;
        }
        
    }
    //METODO Read (consultar)
    public List<Estudiante> consultarTodos() {
        return listaEstudiantes;
    }
    
    //METODO Delelte (Eliminar por documento)
    public boolean eliminar (String documento) {
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getId().equals(documento)) {
                listaEstudiantes.remove(i);
                return true;   
            }
        }
        return false;
        }
    
    //METODO Read (buscar dea uno por documento)
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcestudiantes.controller;

import java.awt.desktop.ScreenSleepEvent;
import java.awt.event.ActionListener;
import mvcestudiantes.model.EstudianteDAO;
import mvcestudiantes.view.VEstudiante;
import mvcestudiantes.view.ScreenManager;

/**
 *
 * @author UIS
 */
public class CEstudiante implements ActionListener{// val.
    
    private VEstudiante vista;
    private EstudianteDAO dao;
    
    public CEstudiante (VEstudiante vista, EstudianteDAO dao) {
        this.vista = vista;
        this.dao = dao;
        
        this.vista.getBtnBuscar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getBtnRegistrar().addActionListener(this);
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter(){
        @Override
        public void windowClosing (java.awt.event.WindowEvent e) {
            ScreenManager.cerrarEstudiantes(CEstudiante.this);
        }
    });
        llenarTabla();
    }
    
    public  void actionPerformed(ActionEvennt e) {
        
        if (e.get) {
            
        }
        
    }
    
}

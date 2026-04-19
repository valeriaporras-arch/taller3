<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcestudiantes.controller;

import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import mvcestudiantes.model.Materia;
import mvcestudiantes.model.Profesores;
import mvcestudiantes.model.ProfesoresDAO;
import mvcestudiantes.view.ScreenManager;
import mvcestudiantes.view.VEstudiante;
import mvcestudiantes.view.VProfesor;

/**
 *
 * @author Usuario
 */
public class CProfesores implements ActionListener{
    private VProfesor vista;
    private ProfesoresDAO dao;
    
    public CEstudiante (VEstudiante vista, ProfesoresDAO dao){
        this.vista = vista;
        this.dao = dao;
        
        this.vista.getBtnBuscar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getBtnRegistrar().addActionListener(this);
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                ScreenManager.cerrarProfesor(CProfesores.this);
            }
        });
        llenarTabla();
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == vista.getBtnRegistrar()) {
            registrar();
        }else if (e.getSource() == vista.getBtnModificar()) {
            actualizar();
        }else if (e.getSource() == vista.getBtnEliminar()) {
            eliminar();
        }else if (e.getSourse() == vista.getBtnBuscar()) {
            consultar();
        }
    }
    
    private void registrar() {
        try {
            Profesores prof = capturarDatos();
            if (dao.guardar(prof)) {
                JOptionPane.showMessageDialog(vista, "Profesor guardado.");
                llenarTabla();
                limpiarCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error en datos: " + ex.getMessage());
        }
    }
    
    private void consultar(){
        
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcestudiantes.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mvcestudiantes.model.Materia;
import mvcestudiantes.model.Profesores;
import mvcestudiantes.model.ProfesoresDAO;
import mvcestudiantes.view.ScreenManager;
import mvcestudiantes.view.VEstudiante;
import mvcestudiantes.view.VProfesor;

/**
 *
 * @author Usuario
 */
public class CProfesores implements ActionListener{

    public VProfesor getVista() {
        return vista;
    }

    public ProfesoresDAO getDao() {
        return dao;
    }
    
    
    
    private VProfesor vista;
    private ProfesoresDAO dao;
    
    public CProfesores (VProfesor vista, ProfesoresDAO dao){
        this.vista = vista;
        this.dao = dao;
        
        this.vista.getBtnBuscar().addActionListener(this);
        this.vista.getBtnEliminar().addActionListener(this);
        this.vista.getBtnModificar().addActionListener(this);
        this.vista.getBtnRegistrar().addActionListener(this);
        
        this.vista.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                ScreenManager.cerrarProfesor(CProfesores.this);
            }
        });
        llenarTabla();
    }

    @Override
    public void actionPerformed (ActionEvent e) {
        
        if (e.getSource() == vista.getBtnRegistrar()) {
            registrar();
        }else if (e.getSource() == vista.getBtnModificar()) {
            actualizar();
        }else if (e.getSource() == vista.getBtnEliminar()) {
            eliminar();
        }else if (e.getSource() == vista.getBtnBuscar()) {
            consultar();
        }
    }
    
    private void registrar() {
        try {
            Profesores prof = capturarDatos();
            if (dao.guardar(prof)) {
                JOptionPane.showMessageDialog(vista, "Profesor guardado.");
                llenarTabla();
                limpiarCampos();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error en datos: " + ex.getMessage());
        }
    }
    
    private void consultar(){
        int doc = (int) vista.getSpnId().getValue();
        Profesores prof = dao.buscarporDoc(doc);
        
        if (prof != null) {
            vista.getTxtNombres().setText(prof.getNombre());
            vista.getTxtApellidos().setText(prof.getApellido());
            vista.getTxtMateria().setText(prof.getMateria());
        }else{
            JOptionPane.showMessageDialog(vista, "Profesor no encontrado.");
        }
    }
    
    private void actualizar(){
        String doc = (String) vista.getSpnId().getValue();
        try {
            Profesores actualizado = capturarDatos();
            
            if (dao.actualizarDatos(actualizado)) {
                JOptionPane.showMessageDialog(vista, "Actualizado con éxito.");
                llenarTabla();
            }else{
                JOptionPane.showMessageDialog(vista, "no se pudo actualizar.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(vista, "Error al actualizar. ");
        }
    }
    
    private void eliminar(){
        int doc = (int)vista.getSpnId().getValue();
        if (dao.eliminar(doc)) {
            JOptionPane.showMessageDialog(vista, "Prtofesor eliminado.");
            limpiarCampos();
            llenarTabla();
        }else{
            JOptionPane.showMessageDialog(vista, "No se encontro el registro");
        }
    }
    
    private void llenarTabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) vista.getTblProfesor().getModel();
        modeloTabla.setRowCount(0);
        
        List<Profesores> lista = dao.consultartodos();
        
        Object[] fila = new Object[4];
        for (Profesores prof : lista) {
            fila[0] = prof.getId();
            fila[1] = prof.getNombre();
            fila[2] = prof.getApellido();
            fila[3] = prof.getMateria();
            modeloTabla.addRow(fila);
        }
    }
    
    private Profesores capturarDatos() {
        return new Profesores(
                (int)vista.getSpnId().getValue(),
                vista.getTxtNombres().getText(),
                vista.getTxtApellidos().getText(),
                vista.getTxtMateria().getText()
                );
    }
    
    private void limpiarCampos(){
        vista.getSpnId().setValue("");
        vista.getTxtNombres().setText("");
        vista.getTxtApellidos().setText("");
        vista.getTxtMateria().setText("");
        vista.getSpnId().requestFocus();
    }
    public void finalizar(){
        this.vista.dispose();
        this.vista = null;
        this.dao = null;
        
        System.out.println("Controlador y referencias liberadas.");
    }
    
}
>>>>>>> c4f450b99f6a37af5b39f237b0d3e47335cd070c

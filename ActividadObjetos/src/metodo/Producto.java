/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private int existencias;

    public Producto(int idProducto, String nombre, String descripcion, int existencias) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencias = existencias;
    }
}

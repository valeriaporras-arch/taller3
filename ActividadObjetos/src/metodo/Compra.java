/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodo;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Compra {
    private int idCompra;
    private String fechaCompra;
    private double valorCompra;
    private Proveedor proveedor;
    private Administrador administrador;
    private ArrayList<Producto>productos;

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Compra(int idCompra, String fechaCompra, double valorCompra, Proveedor proveedor, Administrador administrador, ArrayList<Producto> productos) {
        this.idCompra = idCompra;
        this.fechaCompra = fechaCompra;
        this.valorCompra = valorCompra;
        this.proveedor = proveedor;
        this.administrador = administrador;
        this.productos = productos;
    }



}

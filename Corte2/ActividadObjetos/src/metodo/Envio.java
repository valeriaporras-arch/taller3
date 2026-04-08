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
public class Envio {
    private int idEnvio;
    private String empresaTransportadora;
    private String fechaEstimada;
    private double costoEnvio;
    private String direccion;
    private ArrayList<Compra>compras;

    public Envio(int idEnvio, String empresaTransportadora, String fechaEstimada, double costoEnvio, String direccion, ArrayList<Compra> compras) {
        this.idEnvio = idEnvio;
        this.empresaTransportadora = empresaTransportadora;
        this.fechaEstimada = fechaEstimada;
        this.costoEnvio = costoEnvio;
        this.direccion = direccion;
        this.compras = compras;
    }
}

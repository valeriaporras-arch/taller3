/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Market;
import java.util.ArrayList;
import metodo.*;

/**
 *
 * @author Usuario
 */
public class Market {

    public static void main(String[] args) {
        Proveedor p=new Proveedor(0,"Carlos Puentes","321321");
        Administrador a=new Administrador(0, 1, "Juana", "Rodriguez", "4318437", "cll 12838");
        Producto p1=new Producto(0, "Arroz 500g", "Arroz Blanco 500g", 3);
        Producto p2=new Producto(1,"Carne 2kg","Brisket de res peso 2kg",2);
        Producto p3=new Producto(2,"Leche 1L","Leche 1L entera",5);
        ArrayList<Producto>productos=new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        Compra c1=new Compra(0, "25/03/2026", 20, p, a, productos);
        System.out.println(p.getNombre());
        
    }
    
}

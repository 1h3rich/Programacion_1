/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTienda;
import java.util.ArrayList;

/**
 *
 * @author Rich
 */
public class Tienda {
    private final String nom_tienda;
    private double saldo_tienda;
    private static double descuento_global;
    private final ArrayList<Producto> lista = new ArrayList();

    public Tienda(String nom_tienda, double saldo_tienda) {
        this.nom_tienda = nom_tienda;
        this.saldo_tienda = saldo_tienda;
    }
    //setters

    public void setSaldo_tienda(double saldo_tienda) {
        this.saldo_tienda = saldo_tienda;
    }
    
    //getters
    public String getNom_tienda() {
        return nom_tienda;
    }

    public double getSaldo_tienda() {
        return saldo_tienda;
    }

    public static double getDescuento_global() {
        return descuento_global;
    }
    
    //clases

    public void añadirProducto(Producto producto){
        lista.add(producto);
    }
    
    public String mostrarProducto(){
        String cadena = "";
        for (Producto p : lista) {
            cadena = cadena + p;
        }       
        return cadena;
    }
    
    public Producto buscarProducto(int barras){
        for (Producto producto : lista) {
            if(producto.getCod_Barras() == barras){
                return producto;
            }
        }
        return null;
    }
    
    public void mod_des_global(double descuento){
        if(descuento < 0 || descuento > 100){
            System.out.println("Un descuento debe comprender entre 0 y 100");                    
        }else{
            descuento_global = descuento;
        }
    }
}

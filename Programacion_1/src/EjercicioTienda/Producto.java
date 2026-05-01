/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTienda;

/**
 *
 * @author Rich
 */
public class Producto {
    private int Cod_Barras;
    private String NombrePrducto;
    private double precio;
    private int stock;

    public Producto(int Cod_Barras, String NombrePrducto, double precio, int stock) {
        this.Cod_Barras = Cod_Barras;
        this.NombrePrducto = NombrePrducto;
        this.precio = precio;
        this.stock = stock;
    }

    //getter
    public int getCod_Barras() {
        return Cod_Barras;
    }

    public String getNombrePrducto() {
        return NombrePrducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    //setters

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    //to.String

    @Override
    public String toString() {
        return "\nProducto - " + "Cod_Barras = " + Cod_Barras + "\nNombrePrducto=" + NombrePrducto + "\nprecio = " + precio + "\nstock = " + stock;
    }
    
    
    
}

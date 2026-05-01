/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioTienda;

/**
 *
 * @author Rich
 */
public class Cliente {

    private String nom_cliente;
    private double saldo_disponible;

    public Cliente(String nom_cliente, double saldo_disponible) {
        this.nom_cliente = nom_cliente;
        this.saldo_disponible = saldo_disponible;
    }

    public void comprar_producto(int barras, Tienda t) {
        Producto p = t.buscarProducto(barras);
        if(p != null){
            //stock
            int s_restante = p.getStock() - 1;
            p.setStock(s_restante);
            //saldo
            double sd_restante = saldo_disponible - p.getPrecio();
            this.saldo_disponible = sd_restante;
            //saldo tienda
            double sd_tienda = t.getSaldo_tienda() + p.getPrecio();
            t.setSaldo_tienda(sd_tienda);
            
        }else{
            System.out.println("Producto no disponible o fuera de stock");
        }
    }
    
    public void recarga_saldo(double recarga){
        if(recarga <= 0){
            System.out.println("La recarga debe ser superior a 0");
        }else{
            this.saldo_disponible = this.saldo_disponible + recarga;
        }
    }

    @Override
    public String toString() {
        return "\nCliente: " + "nom_cliente = " + nom_cliente + "\nsaldo_disponible = " + saldo_disponible;
    }
    
    
}

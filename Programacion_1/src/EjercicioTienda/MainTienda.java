/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjercicioTienda;

/**
 *
 * @author Rich
 */
public class MainTienda {

    public static void main(String[] args) {
        //objetos
        Tienda Smoofi = new Tienda("Smoofi", 10000);
        Producto Smoofi_Chocolate = new Producto(1111, "Smoofi chocolate", 9.99, 10);
        Producto Smoofi_Fresa = new Producto(1112, "Smoofi Fresa", 9.99, 5);
        Producto Smoofi_Arandanos = new Producto(1113, "Smoofi Arandanos", 9.99, 5);
        Producto Smoofi_Lotus = new Producto(1114, "Smoofi Lotus", 9.99, 20);
        Producto Smoofi_Menta = new Producto(1115, "Smoofi Menta", 9.99, 20);
        Producto Smoofi_Vainilla = new Producto(1116, "Smoofi Vainilla", 9.99, 20);
        Smoofi.añadirProducto(Smoofi_Chocolate);
        Smoofi.añadirProducto(Smoofi_Arandanos);
        Smoofi.añadirProducto(Smoofi_Fresa);
        Smoofi.añadirProducto(Smoofi_Lotus);
        Smoofi.añadirProducto(Smoofi_Menta);
        Smoofi.añadirProducto(Smoofi_Vainilla);
        Cliente Roberto = new Cliente("Roberto", 20);
        Cliente Ricardo = new Cliente("Ricardo", 50);
        Cliente Juan = new Cliente("Juan", 10);
        Cliente Paula = new Cliente("Paula", 200);
        
        //Simular
        Ricardo.comprar_producto(1111, Smoofi);
        Roberto.comprar_producto(1113, Smoofi);
        Juan.comprar_producto(1116, Smoofi);
        Paula.comprar_producto(1114, Smoofi);
        
        //Escribir
        System.out.println(Ricardo.toString());
        System.out.println(Juan.toString());
        System.out.println(Paula.toString());
        System.out.println(Roberto.toString());
        
        System.out.println(Smoofi_Chocolate.toString());
        System.out.println(Smoofi_Fresa.toString());
        System.out.println(Smoofi_Menta.toString());
        
        System.out.println("\nSaldo de la tienda: " + Smoofi.getSaldo_tienda());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_9.Ejercicio_3;

/**
 *
 * @author Rich
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Libro libro_1 = new Libro("La cuadruple raiz del principio del razón suficiente", "2014", "Arthur Schopenhauer", 4.99);
        Libro libro_2 = new Libro("Sobre la brevedad de la vida", "1999", "Seneca", 4.99);
        Libro libro_3 = new Libro("La critica de la razon pura", "1864", "Immanuel Kant", 15.99);
        
        Pelicula Peli_1 = new Pelicula("Avatar", "2012", "Jose Luis", 4.95);
        Pelicula Peli_2 = new Pelicula("Spider-man No Way Home", "2022", "Manuel", 6.95);
        Pelicula Peli_3 = new Pelicula("Iron Man 3", "2008", "Hermenegildo", 4.95);
        
        PrecioModificable[] Lista = {libro_1, libro_2, libro_3, Peli_1, Peli_2, Peli_3};
        
        System.out.println("Instanciando libros...");
        for (int i = 0; i < Lista.length; i++) {
            System.out.println(Lista[i]);
            System.out.println("---------------");
        }
        
        System.out.println("Informacion mostrada");
        System.out.println("Mostrando precio con IVA");
        System.out.println("-------------------");
        
        for (int i = 0; i < Lista.length; i++) {
            System.out.println(Lista[i].calcularPrecioConIva());
            System.out.println("--------------");
        }
        
        System.out.println("Precio IVA mostrado");
        System.out.println("Mostrando precio con 10% de descuento");
        
        for (int i = 0; i < Lista.length; i++) {
            System.out.println(Lista[i].calcularPrecioOferta(10));
        }
        
        System.out.println("Mostrado precio con 10% de descuento");
        System.out.println("Mostrar precio con oferta comprando 100");
        
        for (int i = 0; i < Lista.length; i++) {
            System.out.println(Lista[i].calcularPrecioPorCantidad(100));
        }
    }
    
}

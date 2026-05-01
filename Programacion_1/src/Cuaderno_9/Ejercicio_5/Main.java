/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

import Cuaderno_9.Ejercicio_5.config.Validators;
import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario(20);
        int opcion;
        int numBebidas;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("0) Salir");
            System.out.println("1) Rellenar inventario");
            System.out.println("2) Consultar todas");
            System.out.println("3) Consultar refrescos");
            System.out.println("4) Consultar fermentadas");
            System.out.println("5) Consultar destiladas");
            System.out.println("6) Consultar por precio");
            System.out.println("7) Número de refrescos gaseosos");
            System.out.println("--------------");

            opcion = sc.nextInt();

            if (!Validators.comprenderEntre(-1, 8, opcion)) {
                System.out.println("Opción no válida.");
                break;
            }

            switch (opcion) {

                case 0 -> {
                    System.out.println("Saliendo...");
                    return;
                }

                case 1 -> {
                    System.out.println("Dime el número de Bebidas a insertar");
                    numBebidas = sc.nextInt();

                    if (!Validators.comprenderEntre(0, 21, numBebidas)) {
                        System.out.println("Número excedido");
                        break;
                    }
                    Metodos.rellenarBebidas(inventario, numBebidas);
                }
                case 2 -> {
                    Metodos.consultarBebidas(inventario);
                }
                case 3 -> {
                    Metodos.consultarBebidaEspecifica(inventario, Refrescos.class);
                }
                case 4 -> {
                    Metodos.consultarBebidaEspecifica(inventario, Fermentadas.class);
                }
                case 5 -> {
                    Metodos.consultarBebidaEspecifica(inventario, Destilada.class);
                }
                case 6 -> {
                    if (!Validators.comprobarInventario(inventario)) {
                        System.out.println("Inventario vacio");
                    } else {
                        System.out.println("Precio minimo: ");
                        double min_price = sc.nextDouble();
                        System.out.println("Precio maximo: ");
                        double max_price = sc.nextDouble();
                        
                        System.out.println(Metodos.dentroDelRangoDePrecio(inventario, min_price, max_price));;
                    }
                }

                case 7 -> {
                    if (!Validators.comprobarInventario(inventario)) {
                        System.out.println("Inventario vacio");
                    } else {
                        int contGaseosos = Metodos.contarBebidasGaseosas(inventario);
                        System.out.println(
                                "Número de Refrescos Gaseosos: " + contGaseosos);
                    }
                }
            }

        } while (true);

    } 

}

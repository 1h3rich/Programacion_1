/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_6.Ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author Rich
 */
public class Actividad1 {

    static Scanner sc = new Scanner(System.in);
    static double ingreso;
    static String banco;
    static CuentaCorriente cuentaJuan = new CuentaCorriente("12345678A", "Juan Gondalez");
    static CuentaCorriente cuentaMaria = new CuentaCorriente("12345678B", "Maria Gutierrez");
    static CuentaCorriente cuentaRicardo = new CuentaCorriente("12345678C", "Ricardo Gomez");

    public static void main(String[] args) {
        cuentaJuan.gestorAleatorio();
        cuentaMaria.gestorAleatorio();
        cuentaRicardo.gestorAleatorio();

        System.out.println("Bienvenido a la gestoria Kobold");
        System.out.println("Seleccione una acción de las disponibles");
        while (true) {
            System.out.println("------Menu-------");
            System.out.println("1. Ingresar");
            System.out.println("2. Retirar");
            System.out.println("3. Informacion");
            System.out.println("4. Modificar Banco");
            System.out.println("5. Información acerca de los gestores");
            System.out.println("6. Generar un nuevo importe");
            System.out.println("7. Salir");
            int eleccion = sc.nextInt();

            switch (eleccion) {
                case 1 -> {
                    System.out.println("Ha seleccionado ingresar");
                    System.out.println("A quien quiere ingresar (Juan, Maria o Ricardo) ");
                    String p = sc.next();
                    switch (p) {
                        case "juan", "Juan" -> {
                            System.out.println("Cuanto desea ingresar en la cuenta de Juan");
                            ingreso = sc.nextDouble();
                            cuentaJuan.Ingresar(ingreso);
                        }
                        case "maria", "Maria" -> {
                            System.out.println("Cuanto desea ingresar en la cuenta de Maria");
                            ingreso = sc.nextDouble();
                            cuentaMaria.Ingresar(ingreso);
                        }
                        case "ricardo", "Ricardo" -> {
                            System.out.println("Cuanto desea ingresar en cuenta de Ricardo");
                            ingreso = sc.nextDouble();
                            cuentaRicardo.Ingresar(ingreso);
                        }
                        default -> {
                            System.out.println("Asegurese de escribir bien o de elegir una opcion viable");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Ha seleccionado retirar");
                    System.out.println("A quien le quiere retirar (Juan, Maria o Ricardo) ");
                    String p = sc.next();
                    switch (p) {
                        case "juan", "Juan" -> {
                            System.out.println("Cuanto desea retirar de la cuenta de Juan");
                            ingreso = sc.nextDouble();
                            cuentaJuan.Retirar(ingreso);
                        }
                        case "maria", "Maria" -> {
                            System.out.println("Cuanto desea retirar de la cuenta de Maria");
                            ingreso = sc.nextDouble();
                            cuentaMaria.Retirar(ingreso);
                        }
                        case "ricardo", "Ricardo" -> {
                            System.out.println("Cuanto desea retirar de la cuenta de Ricardo");
                            ingreso = sc.nextDouble();
                            cuentaRicardo.Retirar(ingreso);
                        }
                        default -> {
                            System.out.println("Asegurese de escribir bien o de elegir una opcion viable");
                        }
                    }
                }
                case 3 -> {
                    System.out.println("Ha seleccionado informacion");
                    System.out.println("A quien le quiere cotillear (Juan, Maria, Ricardo o todos) ");
                    String p = sc.next();
                    switch (p) {
                        case "juan", "Juan" -> {
                            System.out.println("Cotilleando a Juan");
                            System.out.println(cuentaJuan.getNombreCliente());
                            System.out.println(cuentaJuan.getDNI());
                            System.out.println(cuentaJuan.getSaldo());
                            System.out.println(cuentaJuan.getBanco());
                            System.out.println(cuentaJuan.datosGestor());
                        }
                        case "maria", "Maria" -> {
                            System.out.println("Cotilleando a Maria");
                            System.out.println(cuentaMaria.getNombreCliente());
                            System.out.println(cuentaMaria.getDNI());
                            System.out.println(cuentaMaria.getSaldo());
                            System.out.println(cuentaMaria.getBanco());
                            System.out.println(cuentaMaria.datosGestor());
                        }
                        case "ricardo", "Ricardo" -> {
                            System.out.println("Cotilleando a Ricardo");
                            System.out.println(cuentaRicardo.getNombreCliente());
                            System.out.println(cuentaRicardo.getDNI());
                            System.out.println(cuentaRicardo.getSaldo());
                            System.out.println(cuentaRicardo.getBanco());
                            System.out.println(cuentaRicardo.datosGestor());
                        }

                        case "todos", "Todos" -> {
                            System.out.println("Cotilleando a todos");
                            System.out.println("Juan: ");
                            System.out.println(cuentaJuan.getNombreCliente());
                            System.out.println(cuentaJuan.getDNI());
                            System.out.println(cuentaJuan.getSaldo());
                            System.out.println(cuentaJuan.getBanco());
                            System.out.println(cuentaJuan.datosGestor());
                            System.out.println("Maria: ");
                            System.out.println(cuentaMaria.getNombreCliente());
                            System.out.println(cuentaMaria.getDNI());
                            System.out.println(cuentaMaria.getSaldo());
                            System.out.println(cuentaMaria.getBanco());
                            System.out.println(cuentaMaria.datosGestor());
                            System.out.println("Ricardo: ");
                            System.out.println(cuentaRicardo.getNombreCliente());
                            System.out.println(cuentaRicardo.getDNI());
                            System.out.println(cuentaRicardo.getSaldo());
                            System.out.println(cuentaRicardo.getBanco());
                            System.out.println(cuentaRicardo.datosGestor());

                        }
                        default -> {
                            System.out.println("Asegurese de escribir bien o de elegir una opcion viable");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Ha seleccionado modificar banco");
                    System.out.println("Indiquenos el nombre del nuevo banco");
                    banco = sc.next();
                    cuentaRicardo.setBanco(banco);
                }
                case 5 -> {   
                    System.out.println("Ha seleccionado consultar gestor.");
                    System.out.println("Gestor de Juan: " + cuentaJuan.datosGestor());
                    System.out.println("Gestor de Maria: " + cuentaMaria.datosGestor());
                    System.out.println("Gestor de Ricardo: " + cuentaRicardo.datosGestor());
                }
                case 6 ->{
                    System.out.println("Ha seleccionado modificar importe, elija el usuario");
                    System.out.println("Juan, Maria o Ricardo");
                    String p = sc.next();
                    switch (p) {
                        case "juan", "Juan" -> {
                            System.out.println("Seleccione el nuevo importe");
                            double importe = sc.nextDouble();
                            cuentaJuan.modificarImporte(importe);
                            System.out.println("Importe modificado correctamente");
                        }
                        case "maria", "Maria" -> {
                            System.out.println("Seleccione el nuevo importe");
                            double importe = sc.nextDouble();
                            cuentaMaria.modificarImporte(importe);
                            System.out.println("Importe modificado correctamente");
                        }
                        case "ricardo", "Ricardo" -> {
                           System.out.println("Seleccione el nuevo importe");
                            double importe = sc.nextDouble();
                            cuentaRicardo.modificarImporte(importe);
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Ha seleccionado salir");
                    return;
                }
                default -> {
                    System.out.println("Opción no valida");
                }
            }
        }
    }
}

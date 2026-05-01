/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author 1DAM
 */
public class Menu {

    private static final Scanner sc = new Scanner(System.in);
    private static String titular = "";
    private static int pin;
    private static String DNI;
    private static double cantidad;
    private static int opcion;

    public static void iniciarMenu() {
        System.out.println("Bienvenido, indiquenos lo que quiere hacer: ");
        do {
            System.out.println("1. Crear cuenta bancaria");
            System.out.println("2. Acceder a cuenta bancaria");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ha seleccionado crear cuenta bancaria");
                    //Nombre
                    do {
                        System.out.println("Introduzca el nombre del titular: ");
                        String nombre = sc.next();
                        System.out.println("Introduzca el primer apellido del titular: ");
                        String apellido = sc.next();
                        titular = nombre + " " + apellido;
                    } while (!Comprobaciones.comprobarNombre(titular));
                    //Pin
                    do {
                        System.out.println("Introduzca el pin de la cuenta <min 4 numeros>");
                        pin = sc.nextInt();
                    } while (!Comprobaciones.comprobarPin(pin));
                    //DNI
                    do {
                        System.out.println("Introduzca su DNI");
                        DNI = sc.next();
                    } while (!Comprobaciones.comprobacionDNI(DNI));
                    
                    int codEntidad = (int) (Math.random() * 9000) + 1000;
                    int codOficina = (int) (Math.random() * 9000) + 1000;
                    
                    cuentaBancaria c1 = new cuentaBancaria(titular, codEntidad, codOficina, pin, DNI);
                    cuentaBancaria.listaCuentas.add(c1);
                }
                case 2 -> {
                    System.out.println("Titular: ");
                    sc.nextLine();
                    titular = sc.nextLine();
                    System.out.println("Pin: ");
                    pin = sc.nextInt();

                    cuentaBancaria cuentaActual = null;

                    for (cuentaBancaria c : cuentaBancaria.listaCuentas) {
                        if (c.validarCredenciales(titular, pin)) {
                            cuentaActual = c;
                            break;
                        }
                    }

                    if (cuentaActual != null) {
                        System.out.println("Acceso concedido");
                        do {
                            System.out.println("-------Menu---------");
                            System.out.println("1. Ver CCC completo");
                            System.out.println("2. Ver titular");
                            System.out.println("3. Ver codigo de la entidad");
                            System.out.println("4. Ver codigo de la oficina");
                            System.out.println("5. Ver numero de cuenta");
                            System.out.println("6. Ver digitos de control");
                            System.out.println("7. Ingresar dinero");
                            System.out.println("8. Retirar dinero");
                            System.out.println("9. Consultar Saldo");
                            System.out.println("10. Salir");

                            opcion = sc.nextInt();

                            switch (opcion) {
                                case 1 -> {
                                    System.out.println("CCC: " + cuentaActual.getCCC());
                                }
                                case 2 -> {
                                    System.out.println("Titular: " + cuentaActual.getTitular());
                                }
                                case 3 -> {
                                    System.out.println("Codigo de la entidad: " + cuentaActual.getCodEntidad());
                                }
                                case 4 -> {
                                    System.out.println("Codigo de la oficina: " + cuentaActual.getCodOficina());
                                }
                                case 5 -> {
                                    System.out.println("Ver numero de cuenta: " + cuentaActual.getNumCuenta());
                                }
                                case 6 -> {
                                    System.out.println("Ver digitos de control: " + cuentaActual.getDC());
                                }
                                case 7 -> {
                                    System.out.println("Seleccione la cantidad a ingresar: ");
                                    cantidad = sc.nextDouble();
                                    cuentaActual.ingresar(cantidad);
                                }
                                case 8 -> {
                                    System.out.println("Seleccione la cantidad a retirar: ");
                                    cantidad = sc.nextDouble();
                                    cuentaActual.retirar(cantidad);
                                }
                                case 9 -> {
                                    System.out.println("Saldo: " + cuentaActual.getSaldo());
                                }
                                case 10 -> {
                                    System.out.println("Saliendo de la cuenta....");
                                }
                                default -> {
                                    System.out.println("Opcion no valida");
                                }
                            }
                        } while (opcion != 10);
                    } else {
                        System.out.println("Titular o contraseña incorrectos");
                    }

                }
                case 3 -> {
                    System.out.println("Saliendo del programa...");
                }
            }

        } while (opcion != 3);
    }
}

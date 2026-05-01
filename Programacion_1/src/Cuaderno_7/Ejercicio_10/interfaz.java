/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_7.Ejercicio_10;

import java.util.Scanner;

/**
 *
 * @author Rich
 */
public class interfaz {

    static Scanner sc = new Scanner(System.in);
    static repositorio repo = new repositorio(10);

    public static void interfaz() {
        System.out.println("Bienvenido...");
        while (true) {
            System.out.println("1. Agregar/Eliminar empleado");
            System.out.println("2. Mostrar información acerca de los empleados");
            int eleccion = sc.nextInt();
            switch (eleccion) {
                case 1 -> {
                    System.out.println("Has seleccionado agregar/eliminar empleado");
                    System.out.println("1. Agregar");
                    System.out.println("2. Eliminar");
                    eleccion = sc.nextInt();
                    switch (eleccion) {
                        case 1 -> {
                            System.out.println("NIF: ");
                            String nif = sc.next();
                            System.out.println("Nombre completo: ");
                            System.out.println("Nombre: ");
                            String nombre = sc.next();
                            System.out.println("Apellido: ");
                            String apellido = sc.next();
                            System.out.println("Dia: ");
                            String dia = sc.next();
                            System.out.println("Mes: ");
                            String mes = sc.next();
                            System.out.println("Año: ");
                            String año = sc.next();
                            System.out.println("Direccion completa: ");
                            System.out.println("Calle: ");
                            String calle = sc.next();
                            System.out.println("Ciudad: ");
                            String ciudad = sc.next();
                            System.out.println("Pais");
                            String pais = sc.next();
                            System.out.println("Telefono: ");
                            int telefono = sc.nextInt();
                            System.out.println("Correo: ");
                            String correo = sc.next();

                            String nombre_completo = nombre + "" + apellido;
                            String f_nacimiento = dia + "/" + mes + "/" + año;
                            String d_completa = calle + "/" + ciudad + "/" + pais;

                            empleados e = new empleados(nif, nombre_completo, f_nacimiento, d_completa, telefono, correo);
                            boolean puede = true;

                            if (repo.insertar(e)) {
                                System.out.println("Agregado correctamente");
                            } else {
                                System.out.println("Repositorio de empleados lleno");
                                puede = false;
                            }

                            if (puede) {
                                System.out.println("Seleccione el departamento y la información necesaria del empleado");
                                System.out.println("1. Oficinista");
                                System.out.println("2. Conductor");
                                System.out.println("3. Limpiador");
                                System.out.println("4. Ninguno");
                                eleccion = sc.nextInt();
                                switch (eleccion) {
                                    case 1 -> {
                                        System.out.println("Ha seleccionado oficinista");
                                        System.out.println("Titulación: ");
                                        String titulacion = sc.next();
                                        System.out.println("Horario predefinido de mañana ");
                                        String horario = "Diurno";
                                        oficinistas o = new oficinistas(titulacion, horario);
                                        e.setOficinistas(o);
                                        System.out.println("Empleado oficinista agregado correctamente");
                                    }
                                    case 2 -> {
                                        System.out.println("Ha seleccionado conductor");
                                        System.out.println("Carnets: ");
                                        int carnets = sc.nextInt();
                                        System.out.println("Año: ");
                                        int anyo = sc.nextInt();
                                        conductores c = new conductores(carnets, anyo);
                                        e.setConductores(c);
                                        System.out.println("Empleado conductor agregado correctamente");
                                    }
                                    case 3 -> {
                                        System.out.println("Ha seleccionado limpiador");
                                        System.out.println("Indique lo siguiente: ");
                                        System.out.println("1. Limpian los buses");
                                        System.out.println("2. Limpian las oficinas");
                                        System.out.println("3. Limpian ambas ubicaciones");
                                        eleccion = sc.nextInt();
                                        switch (eleccion) {
                                            case 1 -> {
                                                limpiadores l = new limpiadores(true, false);
                                                e.setLimpiadores(l);
                                            }
                                            case 2 -> {
                                                limpiadores l = new limpiadores(false, true);
                                                e.setLimpiadores(l);
                                            }
                                            case 3 -> {
                                                limpiadores l = new limpiadores(true, true);
                                                e.setLimpiadores(l);
                                            }
                                        }
                                        System.out.println("Empleado limpiador agregado correctamente");
                                    }
                                }

                            }

                        }
                        case 2 -> {
                            System.out.println("Ha seleccionado eliminar: ");
                            System.out.println("Indique el id del empleado que desea eliminar");
                            repo.mostrar();
                            int id = sc.nextInt();
                            repo.eliminar(id);
                            System.out.println("Eliminado correctamente");

                        }
                    }
                }

                case 2 -> {
                    System.out.println("Ha elegido ver informacion de los empleados");
                    repo.mostrar();
                }
            }
        }
    }
}

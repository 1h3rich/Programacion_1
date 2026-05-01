/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author Rich
 */
public class Menu {

    public static void iniciarMenu() {
        Scanner sc = new Scanner(System.in);
        Pantalla itf = new Pantalla();
        int salir = 0;
        int salir2 = 0;
        while (salir == 0) {
            System.out.println("Eliga una opcion: ");
            System.out.println("        1. Salir");
            System.out.println("        2. Añadir");
            System.out.println("        3. Actualizar");
            System.out.println("        4. Consultar segun posicion");
            System.out.println("        5. Consultar toda la informacion");
            System.out.println("        6. Ordenar por grosor ascendente");
            System.out.println("        7. Ordenar por color ascendente");
            System.out.println("        8. Ordenar por perimetro descendente");
            System.out.println("        9. Ordenar por area descendente");

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    salir = 1;
                }
                case 2 -> {
                    System.out.println("Seleccione la figura a añadir");
                    System.out.println("Eliga la figura: ");
                    System.out.println("        1. Triangulo");
                    System.out.println("        2. Rectangulo");
                    System.out.println("        3. Circulo");
                    int opcionFigura = sc.nextInt();
                    switch (opcionFigura) {
                        case 1 -> {
                            salir2 = 0;
                            while (salir2 == 0) {
                                System.out.println("Selecciona el lado del triangulo: ");
                                double lado = sc.nextDouble();
                                System.out.println("Seleccion el grosor de la linea: ");
                                double grosor = sc.nextDouble();
                                System.out.println("Selecciona el color de la figura: ");
                                String color = sc.next();

                                Triangulo t = new Triangulo(lado, grosor, color);
                                itf.lista.add(t);
                                System.out.println("Quieres añadir más triangulos?");
                                System.out.println("1. Si /// 2. No");
                                int opcionSalir = sc.nextInt();
                                switch (opcionSalir) {
                                    case 1 -> {
                                    }
                                    case 2 -> {
                                        salir2 = 1;
                                    }
                                    default -> {
                                        System.out.println("Opcion no valida");
                                        salir2 = 1;
                                    }
                                }
                            }
                        }
                        case 2 -> {
                            salir2 = 0;
                            while (salir2 == 0) {
                                System.out.println("Selecciona la base del rectangulo: ");
                                double base = sc.nextDouble();
                                System.out.println("Selecciona la altura del rectangulo: ");
                                double altura = sc.nextDouble();
                                System.out.println("Seleccion el grosor de la linea: ");
                                double grosor = sc.nextDouble();
                                System.out.println("Selecciona el color de la figura: ");
                                String color = sc.next();

                                Rectangulo r = new Rectangulo(base, altura, grosor, color);
                                itf.lista.add(r);

                                System.out.println("Quieres añadir más rectangulos?");
                                System.out.println("1. Si /// 2. No");
                                int opcionSalir = sc.nextInt();
                                switch (opcionSalir) {
                                    case 1 -> {
                                    }
                                    case 2 -> {
                                        salir2 = 1;
                                    }
                                    default -> {
                                        System.out.println("Opcion no valida");
                                        salir2 = 1;
                                    }
                                }
                            }
                        }
                        case 3 -> {
                            salir2 = 0;
                            while (salir2 == 0) {
                                System.out.println("Selecciona el tamaño del radio del circulo: ");
                                double radio = sc.nextDouble();
                                System.out.println("Seleccion el grosor de la linea: ");
                                double grosor = sc.nextDouble();
                                System.out.println("Selecciona el color de la figura: ");
                                String color = sc.next();

                                Circulo c = new Circulo(radio, grosor, color);
                                itf.lista.add(c);

                                System.out.println("Quieres añadir más circulos?");
                                System.out.println("1. Si /// 2. No");
                                int opcionSalir = sc.nextInt();
                                switch (opcionSalir) {
                                    case 1 -> {
                                    }
                                    case 2 -> {
                                        salir2 = 1;
                                    }
                                    default -> {
                                        System.out.println("Opcion no valida");
                                        salir2 = 1;
                                    }
                                }
                            }
                        }
                    }
                }
                case 3 -> {
                    if (itf.lista.size() < 1) {
                        System.out.println("No hay ninguna figura almacenada");
                        continue;
                    }

                    System.out.println("Eliga la figura a actualizar: ");
                    System.out.println("        1. Triangulo");
                    System.out.println("        2. Rectangulo");
                    System.out.println("        3. Circulo");
                    int opcionFigura = sc.nextInt();
                    switch (opcionFigura) {
                        case 1 -> {
                            System.out.println("Selecciona el lado del triangulo: ");
                            double lado = sc.nextDouble();
                            System.out.println("Seleccion el grosor de la linea: ");
                            double grosor = sc.nextDouble();
                            System.out.println("Selecciona el color de la figura: ");
                            String color = sc.next();

                            Triangulo t = new Triangulo(lado, grosor, color);

                            System.out.println("Que posicion desea actualizar?");
                            int posicion = sc.nextInt();
                            itf.actualizar(posicion, t);
                        }
                        case 2 -> {
                            System.out.println("Selecciona la base del rectangulo: ");
                            double base = sc.nextDouble();
                            System.out.println("Selecciona la altura del rectangulo: ");
                            double altura = sc.nextDouble();
                            System.out.println("Seleccion el grosor de la linea: ");
                            double grosor = sc.nextDouble();
                            System.out.println("Selecciona el color de la figura: ");
                            String color = sc.next();

                            Rectangulo r = new Rectangulo(base, altura, grosor, color);
                            itf.lista.add(r);

                            System.out.println("Que posicion desea actualizar?");
                            int posicion = sc.nextInt();
                            itf.actualizar(posicion, r);
                        }
                        case 3 -> {
                            System.out.println("Selecciona el tamaño del radio del circulo: ");
                            double radio = sc.nextDouble();
                            System.out.println("Seleccion el grosor de la linea: ");
                            double grosor = sc.nextDouble();
                            System.out.println("Selecciona el color de la figura: ");
                            String color = sc.next();

                            Circulo c = new Circulo(radio, grosor, color);
                            itf.lista.add(c);

                            System.out.println("Que posicion desea actualizar?");
                            int posicion = sc.nextInt();
                            itf.actualizar(posicion, c);
                        }
                    }
                }
                case 4 -> {
                    salir2 = 0;
                    while (salir2 == 0) {
                        System.out.println("Seleccione la posicion a consultar: ");
                        int posicion = sc.nextInt();
                        itf.consultar(posicion);

                        System.out.println("Desea consultar alguna otra posicion?");
                        System.out.println("1. Si /// 2. No");
                        int opcionSalir = sc.nextInt();
                        switch (opcionSalir) {
                            case 1 -> {

                            }
                            case 2 -> {
                                salir2 = 1;
                            }
                            default -> {
                                System.out.println("Opcion no valida");
                                salir2 = 1;
                            }
                        }
                    }
                }
                case 5 -> {
                    if (itf.lista.size() < 1) {
                        System.out.println("No existen datos");
                    }
                    System.out.println(itf);
                }
                case 6 -> {
                    for (int i = 0; i < itf.lista.size()-1; i++) {
                        for (int j = i+1; j < itf.lista.size(); j++) {
                            if (itf.lista.get(i).getGrosor() > itf.lista.get(j).getGrosor()) {
                                Figuras temp = itf.lista.get(i);
                                itf.lista.set(i, itf.lista.get(j));
                                itf.lista.set(j, temp);
                            }
                        }
                    }
                    for (Figuras figura : itf.lista) {
                        System.out.println(figura);
                    }
                    
                }
                case 7 -> {
                    for (int i = 0; i < itf.lista.size() -1; i++) {
                        for (int j = i+1; j < itf.lista.size(); j++) {
                            if (itf.lista.get(i).getColor().equalsIgnoreCase(itf.lista.get(j).getColor())) {
                                Figuras temp = itf.lista.get(i);
                                itf.lista.set(i, itf.lista.get(j));
                                itf.lista.set(j, temp);
                            }
                        }
                    }
                    for (Figuras figura : itf.lista) {
                        System.out.println(figura);
                    }
                }
                case 8 -> {
                    for (int i = 0; i < itf.lista.size() -1; i++) {
                        for (int j = i+1; j < itf.lista.size(); j++) {
                            if (itf.lista.get(i).perimetro()< itf.lista.get(j).perimetro()) {
                                Figuras temp = itf.lista.get(i);
                                itf.lista.set(i, itf.lista.get(j));
                                itf.lista.set(j, temp);
                            }
                        }
                    }
                    for (Figuras figura : itf.lista) {
                        System.out.println(figura);
                    }
                }
                case 9 -> {
                    for (int i = 0; i < itf.lista.size()-1; i++) {
                        for (int j = i+1; j < itf.lista.size(); j++) {
                            if (itf.lista.get(i).area()< itf.lista.get(j).area()) {
                                Figuras temp = itf.lista.get(i);
                                itf.lista.set(i, itf.lista.get(j));
                                itf.lista.set(j, temp);
                            }
                        }
                    }
                    for (Figuras figura : itf.lista) {
                        System.out.println(figura);
                    }
                }
            }
        }
    }
}

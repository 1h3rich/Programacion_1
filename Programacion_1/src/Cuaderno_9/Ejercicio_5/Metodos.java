/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;
import Cuaderno_9.Ejercicio_5.config.Validators;
import Cuaderno_9.Ejercicio_5.config.utils;

/**
 *
 * @author 1DAM
 */
public class Metodos {

    /**
     * Este metodo sirve para rellenar el objeto Inventario
     *
     * @param inventario Inventario
     * @param numBebidas Cantidad de bebidas que hay
     */
    public static void rellenarBebidas(Inventario inventario, int numBebidas) {
        for (int i = 0; i < numBebidas; i++) {

            int numAl = (int) (Math.random() * 19) + 1;
            double azucar = (Math.random() * 200) + 100;
            double graduacionA = (Math.random() * 11) + 5;
            double graduacionB = (Math.random() * 31) + 15;

            switch (numAl) {
                case 1 -> {
                    utils.tiposResfresco n_R = utils.tiposResfresco.LIMONADA;
                    Refrescos beb = new Refrescos(false, azucar, n_R);
                    inventario.insertar(beb);
                }
                case 2 -> {
                    utils.tiposResfresco n_R = utils.tiposResfresco.COLA;
                    Refrescos beb = new Refrescos(false, azucar, n_R);
                    inventario.insertar(beb);
                }
                case 3 -> {
                    utils.tiposResfresco n_R = utils.tiposResfresco.GRANIZADO;
                    Refrescos beb = new Refrescos(false, azucar, n_R);
                    inventario.insertar(beb);
                }
                case 4 -> {
                    utils.tiposResfresco n_R = utils.tiposResfresco.HELADO;
                    Refrescos beb = new Refrescos(false, azucar, n_R);
                    inventario.insertar(beb);
                }
                case 5 -> {
                    utils.tiposResfresco n_R = utils.tiposResfresco.PONCHE;
                    Refrescos beb = new Refrescos(false, azucar, n_R);
                    inventario.insertar(beb);
                }
                case 6 -> {
                    utils.tiposResfresco n_R = utils.tiposResfresco.TÉ;
                    Refrescos beb = new Refrescos(false, azucar, n_R);
                    inventario.insertar(beb);
                }
                case 7 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.ANIS;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 8 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.COGNAC;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 9 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.GINEBRA;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 10 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.PACHARAN;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 11 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.RON;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 12 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.TEQUILA;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 13 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.VODKA;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 14 -> {
                    utils.tiposDestilada n_R = utils.tiposDestilada.WHISKY;
                    Destilada beb = new Destilada(graduacionB, n_R);
                    inventario.insertar(beb);
                }
                case 15 -> {
                    utils.tiposFermentada n_R = utils.tiposFermentada.CERVEZA;
                    Fermentadas beb = new Fermentadas(graduacionA, n_R);
                    inventario.insertar(beb);
                }
                case 16 -> {
                    utils.tiposFermentada n_R = utils.tiposFermentada.HIDROMIEL;
                    Fermentadas beb = new Fermentadas(graduacionA, n_R);
                    inventario.insertar(beb);
                }
                case 17 -> {
                    utils.tiposFermentada n_R = utils.tiposFermentada.SAKE;
                    Fermentadas beb = new Fermentadas(graduacionA, n_R);
                    inventario.insertar(beb);
                }
                case 18 -> {
                    utils.tiposFermentada n_R = utils.tiposFermentada.VINO;
                    Fermentadas beb = new Fermentadas(graduacionA, n_R);
                    inventario.insertar(beb);
                }
                case 19 -> {
                    utils.tiposFermentada n_R = utils.tiposFermentada.SIDRA;
                    Fermentadas beb = new Fermentadas(graduacionA, n_R);
                    inventario.insertar(beb);
                }

            }
        }

    }

    /**
     * Consulta las bebidas, todas.
     *
     * @param inventario Inventario
     */
    public static void consultarBebidas(Inventario inventario) {

        if (inventario.getIndice() == 0) {
            System.out.println("Inventario vacio");
            return;
        }

        for (int i = 0; i < inventario.getIndice(); i++) {
            if (inventario.getIndice() == 0) {
                System.out.println("Inventario vacio");
            } else {
                Bebida b = inventario.getBebidas()[i];
                System.out.println(i + ": " + b + ".");
            }
        }
    }

    /**
     * Consulta el tipo especifico de bebida
     *
     * @param inventario Inventario
     * @param Tipo Refrescos, Destilada, Fermentada
     */
    public static void consultarBebidaEspecifica(Inventario inventario, Class<?> Tipo) {

        if (!Validators.comprobarInventario(inventario)) {
            System.out.println("Inventario vacio");
        } else {
            for (int i = 0; i < inventario.getIndice(); i++) {
                Bebida b = inventario.getBebidas()[i];

                if (Tipo.isInstance(b)) {
                    System.out.println("-----------------");
                    System.out.println(i + ": " + b + ".");
                }
            }
        }
    }

    /**
     * 
     * @param inventario Inventario
     * @param min_price Precio minimo
     * @param max_price Precio maximo
     * @return Devuelve la suma de String de las bebidas que comprenden entre el precio establecido
     */
    public static String dentroDelRangoDePrecio(Inventario inventario, double min_price, double max_price) {
        String cadena = "";
        for (int i = 0; i < inventario.getIndice(); i++) {
            if (inventario.getBebidas()[i].calcularPrecio() > min_price && inventario.getBebidas()[i].calcularPrecio() < max_price) {
                Bebida b = inventario.getBebidas()[i];
                cadena = cadena + ("\n" + i + ": " + b + ".") + "\n---------------";
            }
        }
        return cadena;
    }

    /**
     * Cuenta las bebidas gaseosas.
     * @param inventario
     * @return Devuelve el numero contGaseosos que se calcula con el for
     */
    public static int contarBebidasGaseosas(Inventario inventario) {
        int contGaseosos = 0;
        for (int i = 0; i < inventario.getIndice(); i++) {
            if (inventario.getBebidas()[i] instanceof Refrescos) {
                Refrescos ref = (Refrescos) inventario.getBebidas()[i];
                if (ref.isTieneGas()) {
                    contGaseosos++;
                }
            }
        }
        return contGaseosos;
    }
}

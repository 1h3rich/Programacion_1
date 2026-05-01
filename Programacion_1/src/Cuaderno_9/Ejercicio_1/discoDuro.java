/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_1;

/**
 *
 * @author 1DAM
 */
public class discoDuro implements Almacenable {

    private String marca;
    private int capMax;
    private int capUse;
    private int indice = 0;
    private String[] mensajesAlmacenados;

    public discoDuro(String marca) {
        this.marca = marca;
        this.capMax = 512;
        this.capUse = 0;
        mensajesAlmacenados = new String[capMax];
    }

    private int calcularCapacidad(int capMax, String datos) {
        capUse = capMax - datos.length();
        return capUse;
    }

    //Setters
    public void setCapUse(int capUse) {
        this.capUse = calcularCapacidad(capMax, marca);
    }

    //getters

    public int getIndice() {
        return indice;
    }

    public String[] getMensajesAlmacenados() {
        return mensajesAlmacenados;
    }

    /**
     * Guarda los datos pasados en un String
     *
     * @param datos
     * @return true/false
     */
    @Override
    public boolean guardarDatos(String datos) {
        if (datos.length() + capUse > capMax) {
            System.out.println("Capacidad excedida");
            return false;
        }
        mensajesAlmacenados[indice] = datos;
        capUse = capUse + datos.length();
        indice++;
        System.out.println("Guardando el String: " + datos + ", con longitud de: " + datos.length());
        return true;
    }

    /**
     * Lee los datos almacenados en el vector mensajesAlmacenados
     *
     * @return String
     */
    @Override
    public String leerDatos() {
        String cadena = "";
        if (capUse == 0) {
            return cadena = "No hay datos almacenados";
        }

        for (int i = 0; i < indice; i++) {
            cadena += mensajesAlmacenados[i];
        }
        return cadena;
    }

    /**
     * Devuelve si esta lleno o no
     *
     * @return
     */
    @Override
    public boolean estaLleno() {
        if (capUse == 0) {
            System.out.println("No hay datos");
            return false;
        } else if (capUse == capMax) {
            System.out.println("Disco lleno");
            return true;
        } else {
            System.out.println("Queda de almacenamiento: " + (capMax - capUse));
            return false;
        }
    }

    /**
     * Devuelve el modelo, capacidad usada, restante y toal de la memoria USB
     */
    @Override
    public void informacion() {
        System.out.println("Marca: " + marca + ",\n Capacidad Usada: " + capUse + ",\n Capacidad Restante: " + (capMax - capUse) + ",\n Capacidad Total: " + capMax);
    }

    /**
     * Borra los datos de aquellso String coincidentes.
     *
     * @param datos
     * @return
     */
    @Override
    public boolean borrarDatos(String datos) {
        if (capUse == 0) {
            return false;
        } else if (datos.length() == 0) {
            return false;
        } else {
            for (int i = 0; i < indice; i++) {
                if (mensajesAlmacenados[i].equalsIgnoreCase(datos)) {
                    mensajesAlmacenados[i] = "";
                    indice--;
                    capUse = capUse - datos.length();
                    System.out.println("Borrando el String: " + datos + ", con longitud de: " + datos.length());
                    return true;
                }
            }
        }
        return false;
    }

}

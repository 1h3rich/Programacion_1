/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

/**
 *
 * @author Rich
 */
public class Comprobaciones {

    static char[] listaDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    /**
     * Comprueba que el nombre sea valido
     *
     * @param nombre
     * @return
     */
    public static boolean comprobarNombre(String nombre) {

        if (nombre.length() < 10 || nombre.length() > 100) {
            System.out.println("Introduzca un nombre valido");
            return false;
        }

        System.out.println("Nombre y apellidos introducidos correctamente");
        return true;

    }

    /**
     * Comprueba que el pin tenga una longitud minima
     *
     * @param pin
     * @return
     */
    public static boolean comprobarPin(int pin) {

        if (pin < 999) {
            System.out.println("Introduzca una contraseña más larga");
            return false;
        } else {
            System.out.println("Contraseña creada correctamente");
            return true;
        }
    }

    /**
     * Extrae los 8 numeros iniciales con el substring que convierte a int, el
     * primero entra el ultimo no.
     *
     * Extrae con charat el la letra en la posicion 8.
     *
     * compara la letra obtenida del vector dividiendo el numero entre 23 y lo
     * compara con la letra obtenida
     *
     * @param DNI
     * @return
     */
    public static boolean comprobacionDNI(String DNI) {

        if (DNI.length() != 9) {
            System.out.println("Introduzca un DNI valido");
            return false;
        }

        for (int i = 0; i < 8; i++) {
            if (!Character.isDigit(DNI.charAt(i))) {
                System.out.println("Introduzca un DNI valido");
                return false;
            }
        }

        int numero = Integer.parseInt(DNI.substring(0, 8));
        char letra = DNI.toUpperCase().charAt(8);
        if (listaDNI[numero % 23] != letra) {
            System.out.println("Introduzca un DNI valido");
            return false;
        }
        return true;
    }
    
    public static boolean comprobarNumeros(int num){
        return !(num < 1000 || num > 9999);
    }

}

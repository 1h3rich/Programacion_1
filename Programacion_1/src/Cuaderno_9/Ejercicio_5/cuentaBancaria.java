/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuaderno_9.Ejercicio_5;

import java.util.ArrayList;

/**
 *
 * @author 1DAM
 */
public class cuentaBancaria extends Banco implements OperacionesCuenta {

    private String titular;
    private String DNI;
    private String CCC;
    private String DC;
    private String numCuenta;
    private int pin;
    private double saldo;
    private static int contador;
    static int[] listaCCC = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
    static ArrayList<cuentaBancaria> listaCuentas = new ArrayList();

    /**
     * Juan
     *
     * @param titular
     * @param codEntidad
     * @param codOficina
     * @param pin
     * @param DNI
     */
    public cuentaBancaria(String titular, int codEntidad, int codOficina, int pin, String DNI) {
        super(codEntidad, codOficina);

        this.titular = titular;
        this.numCuenta = String.format("%010d", contador);
        contador++;
        this.pin = pin;
        this.DNI = DNI;
        
        this.CCC = calcularCCC(codEntidad, codOficina, this.numCuenta);
        this.DC = this.CCC.substring(8,10);
    }
    
    /**
     * Rodrigo
     *
     * @param titular
     * @param CCC
     * @param pin
     * @param DNI
     */
    public cuentaBancaria(String titular, String CCC, int pin, String DNI) {
        this(
        titular,
        Integer.parseInt(CCC.substring(0,4)),//codEntidad
        Integer.parseInt(CCC.substring(4,8)),//codOficina
        pin,
        DNI
        );
        this.CCC = CCC;
        this.numCuenta = this.CCC.substring(10,20);
    }

    //Override
    //========================================================
    /**
     * Ingresa dinero
     * @param cantidad 
     */
    @Override
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            System.out.println("Saldo agregado satisfactoriamente");
            this.saldo += cantidad;
        }
    }
    /**
     * Retira dinero
     * @param cantidad 
     */
    @Override
    public void retirar(double cantidad) {
        if (cantidad < 0 || cantidad > this.saldo) {
            System.out.println("No se ha podido procesar la peticion");
        } else {
            System.out.println("Retiro exitoso");
            this.saldo -= cantidad;
        }
    }
    /**
     * Consulta el saldo
     * @return 
     */
    @Override
    public double consultarSaldo() {
        System.out.println("Consultando saldo...");
        return getSaldo();
    }

    /**
     * Valida los credenciales comparando en un forEach si en algun objeto coinciden.
     * @param titular
     * @param pin
     * @return 
     */
    @Override
    public boolean validarCredenciales(String titular, int pin) {
        for (cuentaBancaria banco : listaCuentas) {
            if (banco.getTitular().equalsIgnoreCase(titular) && banco.getPin() == pin) {
                return true;
            }
        }
        return false;
    }

    //Metodos
    //============================
    /**
     * Calcula el CCC de cada cuenta Bancaria, los parametros int se convierten
     * en string con al menos 2 ceros a la izquierda y minimo 4 caracteres.
     *
     * Se calcula el dc1 que no es mas que el producto de multiplicar codEntidad + codOficina (1234 + 5678 = 12345678)
     * y el numero de cuenta por la constante guardada en un arrayList llamado listaCCC.
     * @param codEntidad
     * @param codOficina
     * @param numCuenta
     * @return
     */
    public static String calcularCCC(int codEntidad, int codOficina, String numCuenta) {

        String entidad = String.format("%04d", codEntidad);
        String oficina = String.format("%04d", codOficina);

        int dc1 = calcularDC("00" + entidad + oficina);
        int dc2 = calcularDC(numCuenta);

        return entidad + oficina + dc1 + dc2 + numCuenta;
    }

    /**
     * Calcula los dos digitos de control, este metodo va unido al metodo
     * calcularCCC.
     *
     * Necesitamos una variable suma que este definida en 0.
     * 
     * recorremos un for convirtiendo todos los caracteres a un numero, eso se consigue
     * de manera muy interesante cogiendo el char y restandole '0', luego ese int 
     * lo multiplicamos por la posicion i del arraylist ListaCCC.
     * 
     * El resultado sera 11 - suma%11, siendo suma la suma de los productos del numero necesario
     * por la constante.
     * 
     * condiciones de si da 10 u 11.
     * 
     * Devuelve el numero.
     * @param numero
     * @return
     */
    public static int calcularDC(String numero) {

        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            int digito = numero.charAt(i) - '0';
            suma += digito * listaCCC[i];
        }

        int resultado = 11 - (suma % 11);

        if (resultado == 11) {
            return 0;
        }
        if (resultado == 10) {
            return 1;
        }

        return resultado;
    }

    /**
     * Comprueba si es nulo o si es distinto de 16 de longitud.
     *
     * Convierte los caracteres extraidos con subString en un int con
     * integer.parseInt.
     *
     * Una variable String almacena el calculo de calcularCCC y posteriormente
     * lo compara con los digitos de control.
     *
     * @param CCC
     * @return
     */
    public static boolean comprobarCCC(String CCC) {

        if (CCC == null || CCC.length() != 20) {
            return false;
        }

        int codEntidad = Integer.parseInt(CCC.substring(0, 4));
        int codOficina = Integer.parseInt(CCC.substring(4, 8));
        int digitosControl = Integer.parseInt(CCC.substring(8, 10));
        String numCuenta = CCC.substring(10, 20);

        String resultado = calcularCCC(codEntidad, codOficina, numCuenta);

        int dcCalculado = Integer.parseInt(resultado.substring(8, 10));

        return digitosControl == dcCalculado;
    }
    
    //Getters
    //============================
    public String getTitular() {
        return titular;
    }

    public int getPin() {
        return pin;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCCC() {
        return CCC;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public String getDC() {
        return DC;
    }
    
    
    
    //Setters
    //===================================
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCCC(String CCC) {
        this.CCC = CCC;
    }

    @Override
    public String toString() {
        return "cuentaBancaria " + numCuenta + " con el titular: " + titular + ", y un saldo=" + saldo + '.';
    }
    
    
}

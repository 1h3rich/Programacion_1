/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cuaderno_7.Ejercicio_7;
/**
 *
 * @author Rich
 */
public class Calendario {
    
    private int año;
    private int mes;
    private int dia;

    public Calendario(int dia, int mes, int año) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    
    public static int diasDelMes(int año, int mes){
        switch(mes){
            case 4,6,9,11 -> {
                return 30;
            }
            case 2 -> {
                return 28;
            }
            default ->{
                return 31;
            }
        }
    }
    
    
    public void incrementarDia(){
        dia++;
        int maxDias = diasDelMes(año, mes);
        
        if(dia>maxDias){
            dia = 1;
            incrementarMes();
        }
        
    }
    
    public void incrementarMes(){
        mes++;
        if(mes > 12){
            mes = 1;
            incrementarAño(1);
        }
        
        int maxDias = diasDelMes(año, mes);
        if(dia > maxDias){
            dia = maxDias;
        }
    }
    
    public void incrementarAño(int añoSuma){
        if(añoSuma < 0){
            System.out.println("Error");
        }
        
        int añoProvisional = añoSuma + año;
        
        if(año < 0 && añoProvisional >= 0){
            añoProvisional++;
        } else if (añoProvisional == 0){
            añoProvisional = 1;
            año = añoProvisional; 
        }
        
    }
    
    public void mostrar(){
        System.out.println("Dia: " + dia + "/ Mes: " + mes + "/ Año: " + año);
    }
    
    public static boolean FechaCorrecta(int dia, int mes, int año){
        if (mes < 0 || mes > 12) return false;
        if (dia < 0 || mes > 31) return false;
        
        int maxDias = diasDelMes(año, mes);
        return dia <= maxDias;
    }
}

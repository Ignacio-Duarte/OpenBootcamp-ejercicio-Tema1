package com.tema4;

public class SmartDivice {

    // 1 - Argumentos.
    String bateria;
    String pantalla;
    String resolucionPantalla;
    int porcentajeDeCarga;
    boolean conectividadWifi;
    boolean conectividadBluetooh;


    // Constructor

    public SmartDivice(){}

    public SmartDivice(String bateria, String pantalla, String resolucionPantalla, boolean conectividadWifi, boolean conectividadBluetooh, int porcentajeDeCarga) {
        this.bateria = bateria;
        this.porcentajeDeCarga = porcentajeDeCarga;
        this.pantalla = pantalla;
        this.resolucionPantalla = resolucionPantalla;
        this.conectividadWifi = conectividadWifi;
        this.conectividadBluetooh = conectividadBluetooh;
    }


    // Carga el telefono segun el valor "carga" tiene ciertas limitaciones sencillas.
    public void cargarBateria(int carga){
        if(carga > 0 && carga < 101){
            if(this.porcentajeDeCarga + carga <= 100){
                this.porcentajeDeCarga += carga;
                System.out.println("Carga Aplicada - Su telefono esta en: " + this.porcentajeDeCarga + " %");
            }else if(this.porcentajeDeCarga + carga > 99){
                System.out.println("Carga completa - Desconecte el cargador");
            }
        }else {
            System.out.println("Conecte el cargador.");
        }
    }

    @Override
    public String toString() {
        return "SmartDivice{" +
                "bateria='" + bateria + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                ", porcentajeDeCarga=" + porcentajeDeCarga +
                ", conectividadWifi=" + conectividadWifi +
                ", conectividadBluetooh=" + conectividadBluetooh +
                '}';
    }
}

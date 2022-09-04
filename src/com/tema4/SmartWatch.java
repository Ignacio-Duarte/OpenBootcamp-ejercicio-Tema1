package com.tema4;

public class SmartWatch extends SmartDivice {

    // 1 - Argumentos.
    //----------------

    boolean resistenciaAlAgua;
    boolean podometro; // Contador de pasos.

    // Constructor.
    //--------------

    public SmartWatch(){}

    public SmartWatch(String bateria, String pantalla, String resolucionPantalla, boolean conectividadWifi, boolean conectividadBluetooh, int porcentajeDeCarga, boolean resistenciaAlAgua, boolean podometro) {
        super(bateria, pantalla, resolucionPantalla, conectividadWifi, conectividadBluetooh, porcentajeDeCarga);
        this.resistenciaAlAgua = resistenciaAlAgua;
        this.podometro = podometro;
    }

    // Metodos.
    // ---------

    // Este metodo calcula la cantidad de calorias quemadas en X cantidad de pasos..
    // Tener en cuenta que cada 1000 pasos se queman 30 calorias.

    public void caloriasPerdidas(int cantPasos){

        if(cantPasos > 0){
            double calculo = (cantPasos * 30) / 1000;

            System.out.println("Usted quemo: " + calculo + " calorias.");
        }else{
            System.out.println("Camina gordo :v");
        }

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "resistenciaAlAgua=" + resistenciaAlAgua +
                ", podometro=" + podometro +
                ", bateria='" + bateria + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                ", porcentajeDeCarga=" + porcentajeDeCarga +
                ", conectividadWifi=" + conectividadWifi +
                ", conectividadBluetooh=" + conectividadBluetooh +
                '}';
    }
}

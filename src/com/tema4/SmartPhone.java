package com.tema4;

public class SmartPhone extends SmartDivice{

    // 1 - Argumentos
    //----------------

    boolean camara;
    boolean lectorDeHuellas;

    // Constructor.
    //-------------

    // Constructor vacio.
    public SmartPhone(){}

    // Constructor con todos los parametros.
    public SmartPhone(String bateria, String pantalla, String resolucionPantalla, boolean conectividadWifi, boolean conectividadBluetooh, int porcentajeDeCarga, boolean camara, boolean lectorDeHuellas) {
        super(bateria, pantalla, resolucionPantalla, conectividadWifi, conectividadBluetooh, porcentajeDeCarga);
        this.camara = camara;
        this.lectorDeHuellas = lectorDeHuellas;
    }

    // Metodos.
    //--------

    // Depende el valor del booleando devuelve si el telefono se desbloqueo o no.

    public void desbloquearDispositivo(boolean propietario){
        if(propietario){
            System.out.println("Dispositivo Desbloqueado.");
        }else{
            System.out.println("No se reconoce la huella");
        }


    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "camara=" + camara +
                ", lectorDeHuellas=" + lectorDeHuellas +
                ", bateria='" + bateria + '\'' +
                ", pantalla='" + pantalla + '\'' +
                ", resolucionPantalla='" + resolucionPantalla + '\'' +
                ", porcentajeDeCarga=" + porcentajeDeCarga +
                ", conectividadWifi=" + conectividadWifi +
                ", conectividadBluetooh=" + conectividadBluetooh +
                '}';
    }
}

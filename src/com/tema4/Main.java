package com.tema4;

public class Main {

    public static void main(String[] args) {


        // Creando Objetos.

        SmartDivice divice1 = new SmartDivice();
        SmartDivice divice2 = new SmartDivice("5000 mAh", "8.4 pulgadas", "1080x720", true, true, 8);


        System.out.println("-------------------------------------------------------------------");
        System.out.println("Clase SmartDivice Objeto y uso del metodo.");
        System.out.println("------------------------------------------");
        // Clase Smart Divice.
        System.out.println(divice2);
        System.out.println("");
        // Aplicando metodo "cargarBateria"
        divice2.cargarBateria(70);

        System.out.println("-------------------------------------------------------------------");

        System.out.println("");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Clase SmartPhone Objeto y uso de metodo propio y heredado.");
        System.out.println("----------------------------------------------------------");

        SmartPhone motorolaG5 = new SmartPhone();
        SmartPhone motorolaG30plus = new SmartPhone("4500 mAh","OLED", "1280x720", true, true, 35, true, true);

        System.out.println(motorolaG30plus);
        System.out.println("");
        motorolaG30plus.cargarBateria(72);
        motorolaG30plus.desbloquearDispositivo(true);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("");
        System.out.println("*");
        System.out.println("*");
        System.out.println("*");
        System.out.println("");

        System.out.println("-------------------------------------------------------------------");

        System.out.println("Clase SmartWatch Objeto y uso de metodo propio y heradado.");
        System.out.println("----------------------------------------------------------");

        SmartWatch relojSamsung = new SmartWatch();
        SmartWatch relojApple = new SmartWatch("1500 mAh", "OLED", "340x280", true, false,12, true, true);

        System.out.println(relojApple);
        System.out.println("");
        relojApple.cargarBateria(25);
        relojApple.caloriasPerdidas(600);

        System.out.println("-------------------------------------------------------------------");

    }

}

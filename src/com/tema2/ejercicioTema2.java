package com.tema2;

public class ejercicioTema2 {
    public static void main(String[] args) {


        System.out.println(precioMasIva(5.5));

    }

    public static double precioMasIva(double num){
        double precioMasIva;
        double ivaArgentina = 0.21d; // Este valor representa el IVA en Argentina.

        return precioMasIva =  num + (num * ivaArgentina);
        // Retorna el Valor Inicial + el valor inicial * el Iva.
    }

}

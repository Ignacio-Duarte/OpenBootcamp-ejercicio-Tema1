package com.tema5;

import java.util.ArrayList;
import java.util.List;


public class CocheCRUDimpl implements CocheCRUD {

    // Argumentos.

    String color;
    String patente;
    boolean aireAcondiconado;
    boolean papelesAlDia;
    int anioModelo;
    double kilometraje;

    // Estructura de datos.
    List<CocheCRUDimpl> coches = new ArrayList<>();



    // Constructor.

    public CocheCRUDimpl(){}

    public CocheCRUDimpl(String color, String patente, boolean aireAcondiconado, boolean papelesAlDia, int anioModelo, double kilometraje) {
        this.color = color;
        this.patente = patente;
        this.aireAcondiconado = aireAcondiconado;
        this.papelesAlDia = papelesAlDia;
        this.anioModelo = anioModelo;
        this.kilometraje = kilometraje;
    }


    // Metodos.


    @Override
    public void save(CocheCRUDimpl coche) {
        coches.add(coche);
        System.out.println("Vehiculo agregado con exito.");
    }


    @Override
    public void findAll() {
        for(int i = 0; i < coches.size(); i++){
            System.out.println(coches.get(i));
            System.out.print("");
        }
    }

    @Override
    public void delete(CocheCRUDimpl coche) {
        coches.remove(coche);
        System.out.println("Coche eliminado con exito.");
    }


    @Override
    public String toString() {
        return "CocheCRUDimpl{" +
                "color='" + color + '\'' +
                ", patente='" + patente + '\'' +
                ", aireAcondiconado=" + aireAcondiconado +
                ", papelesAlDia=" + papelesAlDia +
                ", anioModelo=" + anioModelo +
                ", kilometraje=" + kilometraje +
                '}';
    }
}

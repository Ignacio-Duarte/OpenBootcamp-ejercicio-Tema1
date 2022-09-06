package com.tema5;

import java.util.List;

public class Main {

    // Argumento para utilizar la interfaz.
    static CocheCRUD metodosCrud = new CocheCRUDimpl();



    public static void main(String[] args) {


        // Creando los objetos Coche.

        CocheCRUDimpl fordMustang = new CocheCRUDimpl("Negro", "XYZ123", true, true, 2016, 7500.50);

        CocheCRUDimpl fordFocus = new CocheCRUDimpl("Azul", "ABC456", false, true, 2007, 25000.67);

        CocheCRUDimpl fiatCronos = new CocheCRUDimpl("Gris","RST789", true, true, 2011, 0 );



        // Agregando Objetos al ArrayList.
        System.out.println("");
        System.out.println("");
        System.out.println("Creando Objetos 'coche'");
        System.out.println("");
        System.out.println("-----------------------");
        metodosCrud.save(fordMustang);
        metodosCrud.save(fordFocus);
        metodosCrud.save(fiatCronos);

        System.out.println("");
        System.out.println("---------------------------------------");

        // Mostrando ArrayList.

        System.out.println("Mostrando todos los coches");
        System.out.println("");
        System.out.println("--------------------------");
        metodosCrud.findAll();
        System.out.println("");
        System.out.println("--------------------------");
        System.out.println("");


        // Eliminar coche.

        System.out.println("Eliminando Coches.");
        System.out.println("");
        System.out.println("------------------");


        metodosCrud.delete(fordFocus);
        // Mostrando lista actualizada de coches.

        System.out.println("");
        System.out.println("Lista actualizada: ");
        metodosCrud.findAll();

        System.out.println("");
        System.out.println("------------------");

















    }
}

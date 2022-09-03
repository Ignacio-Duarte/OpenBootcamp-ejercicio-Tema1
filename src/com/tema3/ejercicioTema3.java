package com.tema3;


public class ejercicioTema3 {

    /*
    Array almacen de palabras para generar Texto.
     */
    static String[] nombre = new String[]{"Hola", "Mundo", "de", "la", "Programacion"};

    /*
    La funcion recibe un parametro de tipo Array para ejecutarse.
    Dentro de la funcion inicializa un bucle for para recorrer el Array
    Luego Inicializa una variable vacia de tipo String "TextoCompleto" que sirve para almacenar el texto final.
    Finalmente lo imprime.
     */
    public static void creandoTexto(String[] palabras){
        String textoCompleto = "";
        for( int i = 0; i < palabras.length; i++){
            textoCompleto = textoCompleto + " " + palabras[i];
        }
        System.out.println(textoCompleto);
    }

    public static void main(String[] args) {

        //Invocando la Funcion.

        creandoTexto(nombre);
    }

}

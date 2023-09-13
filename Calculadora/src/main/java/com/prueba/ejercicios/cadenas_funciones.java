package com.prueba.ejercicios;

import java.util.Arrays;

public class cadenas_funciones {

    public static void main(String[] args) {
        String texto = "franco";
        String texto2 = "SUBNORMAL";
        String texto3 = "tu madre es puta";
        String texto4 = "arriba españa, viva franco";

        System.out.println(texto.toUpperCase());

        System.out.println(texto2.toLowerCase());

        System.out.println(texto3.replace("puta", "p***"));

        System.out.println(Arrays.toString(texto4.split(",")));

        System.out.println(texto3.charAt(3));

        System.out.println(texto3.substring(0, 5));

        System.out.println(texto3.contains("puta"));

        System.out.println(texto4.startsWith("arri"));

        System.out.println(texto.repeat(5));

        String textoInvertido = "";

        for (int i = texto4.length() - 1; i >= 0; i--) {
            textoInvertido = textoInvertido + texto4.charAt(i);
        }

        System.out.println(textoInvertido);

        char[] textoInvertido2 = texto3.toCharArray();

        System.out.println(Arrays.toString(textoInvertido2));

        StringBuilder result = new StringBuilder();

        for (int i = textoInvertido2.length - 1; i >= 0; i--) {

            result.append(textoInvertido2[i]);
        }

        System.out.println(result);

        System.out.println(new StringBuilder(texto3).reverse());

    }
}

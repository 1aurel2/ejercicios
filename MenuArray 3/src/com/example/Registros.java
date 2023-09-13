package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registros {

    //Variables siempre arriba
    private List<Float> tiempos;
    private List<Integer> diatancia;
    private List<String> carreras;
    private Scanner input;
    private int limiteRegistros;

    //Constructor

    public Registros(int limite) {

        tiempos = new ArrayList<>();
        carreras = new ArrayList<>();
        diatancia = new ArrayList<>();
        limiteRegistros = limite;

        input = new Scanner(System.in);
    }

    //Funciones

    // MENU DE TRABAJO PARA INTERACTUAR
    public int mostrarMenu(boolean error) {

        if (error) System.out.println("INTRODUCE UNICAMENTE VALOR [0,1,2,3]");

        System.out.println("----------MENU----------");
        System.out.println("[0] FINALIZAR");
        System.out.println("[1] NUEVO DATO");
        System.out.println("[2] MOSTRAR DATOS");
        System.out.println("[3] BORRAR ULTIMO DATO");
        System.out.println("------------------------");
        System.out.println("TU OPCION ES [0,1,2,3]");

        int respuesta = input.nextInt();

        while (respuesta < 0 || respuesta > 3) respuesta = mostrarMenu(true);

        return respuesta;
    }

    //Solicitar un nuevo registro
    public void nuevoRegistro() {

        System.out.println("Introducir el nuevo tiempo en min,seg");
        float nuevoDato = input.nextFloat();

        if (tiempos.size()  < limiteRegistros) tiempos.add(nuevoDato);

        else System.out.println("Máximo " + limiteRegistros +" elementos, borra un registro");
    }

    //Mostrar registro
    public void mostrarRegistro() {

        System.out.println("------DATOS------");

        for (int i = 0; i < tiempos.size(); i++) {
            System.out.println("dato[" + i + "]:" + tiempos.get(i));
        }

        System.out.println("------------");
    }

    //Eliminar registro
    public void eliminarRegistro() {

        if (tiempos.isEmpty()) System.out.println("No hay registros, introduce uno primero para poder borrar");

        else {

            tiempos.remove(tiempos.size() - 1);
            System.out.println("Ultimo dato eliminado");
        }
    }
}

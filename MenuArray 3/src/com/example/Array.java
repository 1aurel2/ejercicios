package com.example;

import java.util.Scanner;

public class Array {
		
		public static void main(String[] args) {

			Registros registros = new Registros(5);

			//inicializacion de variables 
			int respuesta = -1;
			
			respuesta = registros.mostrarMenu(false);
			
			//acciones sobre el menu 
			while(respuesta !=0) {

                switch (respuesta) {
                    case 1 -> registros.nuevoRegistro();
                    case 2 -> registros.mostrarRegistro();
                    case 3 -> registros.eliminarRegistro();
                }
				respuesta = registros.mostrarMenu(false);
			}
		}

}

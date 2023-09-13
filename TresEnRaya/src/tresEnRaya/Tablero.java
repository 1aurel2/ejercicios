package tresEnRaya;

import java.util.Scanner;

public class Tablero {

	public static void main(String[] args) {
		boolean endGame = false;

		Scanner input = new Scanner(System.in);

		TresEnRaya tresEnRaya = new TresEnRaya();
		
		tresEnRaya.mostrarTablero();

		System.out.println("¿Cuantos jugadores participan?");
		int numero1 = input.nextInt();
		System.out.println();

		while (!endGame){
			if (numero1 == 1) {
				System.out.println("1 jugador vs maquina");
			}else if (numero1 == 2){
				System.out.println("1 jugador vs 1 jugador");
			}
		}
	}

	private void jugadorVsMaquina (Scanner input, TresEnRaya tresEnRaya){

		System.out.println("");
		int pos1 = input.nextInt();

		mueveJugador(tresEnRaya, pos1);
		mueveOrdenador(tresEnRaya);
	}

	private void mueveJugador(TresEnRaya tresEnRaya, int pos){

		if (tresEnRaya.QuedanMovimientos()) tresEnRaya.MueveJugador1(pos);
	}

	private void mueveOrdenador(TresEnRaya tresEnRaya){

		if (tresEnRaya.QuedanMovimientos()) tresEnRaya.MueveOrdenador2();
	}

	private void jugadorVsJugador (Scanner input, TresEnRaya tresEnRaya){}



}

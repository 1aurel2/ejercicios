
public class Cartel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anchura = 5;
		int altura = 7;

		// Letra l
		//
		// *
		// *
		// *
		// *
		// *
		// *
		// *****

		for (int fila = 1; fila <= altura; fila++) {
			//bucle anidado
			for (int columna = 1; columna <= anchura; columna++) {
				if ((columna == 1) && (fila != 7)) {
					System.out.print("*");
				} else if (fila == 7) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();
		// LETRA E
		//
		// *****
		// *
		// *
		// *****
		// *
		// *
		// *****

		for (int fila = 1; fila <= altura; fila++) {
			for (int columna = 1; columna <= anchura; columna++) {
				if ((fila == 1)) {
					System.out.print("*");
				} else if ((fila == (altura / 2) + 1) && (columna < anchura)) {
					System.out.print("*");
				} else if (columna == 1) {
					System.out.print("*");
				} else if (fila == altura) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println();

		// LETRA A
		//
		//   *
		//  * *
		// *   *
		// *****
		// *   *
		// *   *
		// *   *

		for (int i = 1; i <= altura; i++) {

			for (int j = 1; j <= anchura; j++) {

				if (i == 1) {
					if (j == anchura / 2 + 1) System.out.print("*");
					else System.out.print(" ");
				}

				else {
					if (j == 1 || j == anchura) System.out.print("*");

					else if (i == altura / 2 + 1) System.out.print("*");

					else System.out.print(" ");
				}
			}
			System.out.println(); // Salto de línea al final de cada fila
		}
	}
}
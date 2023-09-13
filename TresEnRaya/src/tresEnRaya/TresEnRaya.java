package tresEnRaya;
import java.util.Random;

public class TresEnRaya {
    private char[][] tablero;

    public TresEnRaya() {
        tablero = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public void MueveJugador1(int pos) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;

        if (MovimientoValido(fila, columna)) {
            tablero[fila][columna] = 'O';
        }
    }

    public void MueveJugador2(int pos) {
        int fila = (pos - 1) / 3;
        int columna = (pos - 1) % 3;

        if (MovimientoValido(fila, columna)) {
            tablero[fila][columna] = 'X';
        }
    }

    public void MueveJugador1(int x, int y) {

        if (MovimientoValido(x, y)) {
            tablero[x][y] = 1;
        }
    }

    public void MueveJugador2(int x, int y) {

        if (MovimientoValido(x, y)) {
            tablero[x][y] = 2;
        }
    }

    public boolean MovimientoValido(int fila, int columna) {
        return tablero[fila][columna] == ' ';
    }

    public void MueveOrdenador1() {
        Random rand = new Random();
        int pos;
        do {
            pos = rand.nextInt(9) + 1;
        } while (!MovimientoValido((pos - 1) / 3, (pos - 1) % 3));
        tablero[(pos - 1) / 3][(pos - 1) % 3] = 'O';
    }

    public void MueveOrdenador2() {
        Random rand = new Random();
        int pos;
        do {
            pos = rand.nextInt(9) + 1;
        } while (!MovimientoValido((pos - 1) / 3, (pos - 1) % 3));
        tablero[(pos - 1) / 3][(pos - 1) % 3] = 'X';
    }

    public void Iniciar() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = 0;
            }
        }
    }

    public boolean QuedanMovimientos() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public void mostrarTablero () {
    	
        for (int i = 0; i < 3; i++) {
        	
        	System.out.println();
        	
            for (int j = 0; j < 3; j++) {
                
            System.out.print("|" + tablero[i][j] + "|");
            }
        }
    }
}

   
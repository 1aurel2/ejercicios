package com.prueba.calculadora;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int operacion = 0;
        Calculadora calculadora = new CalculadoraImpl();
        boolean stop = false;

        while(!stop){

            System.out.println("      ___           ___           ___           ___           ___           ___           ___     \n" +
                    "     /\\__\\         /\\__\\         /\\__\\         /\\__\\         /\\__\\         /\\__\\         /\\__\\    \n" +
                    "    /:/  /        /::|  |       /::|  |       /::|  |       /::|  |       /::|  |       /::|  |   \n" +
                    "   /:/  /        /:|:|  |      /:|:|  |      /:|:|  |      /:|:|  |      /:|:|  |      /:|:|  |   \n" +
                    "  /:/  /  ___   /:/|:|__|__   /:/|:|__|__   /:/|:|__|__   /:/|:|__|__   /:/|:|__|__   /:/|:|__|__ \n" +
                    " /:/__/  /\\__\\ /:/ |::::\\__\\ /:/ |::::\\__\\ /:/ |::::\\__\\ /:/ |::::\\__\\ /:/ |::::\\__\\ /:/ |::::\\__\\\n" +
                    " \\:\\  \\ /:/  / \\/__/~~/:/  / \\/__/~~/:/  / \\/__/~~/:/  / \\/__/~~/:/  / \\/__/~~/:/  / \\/__/~~/:/  /\n" +
                    "  \\:\\  /:/  /        /:/  /        /:/  /        /:/  /        /:/  /        /:/  /        /:/  / \n" +
                    "   \\:\\/:/  /        /:/  /        /:/  /        /:/  /        /:/  /        /:/  /        /:/  /  \n" +
                    "    \\::/  /        /:/  /        /:/  /        /:/  /        /:/  /        /:/  /        /:/  /   \n" +
                    "     \\/__/         \\/__/         \\/__/         \\/__/         \\/__/         \\/__/         \\/__/    ");

            System.out.println("buenos dias caballero, ¿que operacion quieres hacer?");

            System.out.println("1 - SUMAR");
            System.out.println("2 - RESTAR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("5 - RAIZ CUADRADA");
            System.out.println("6 - EXPONENCIAL");
            System.out.println("7 - SALIR");

            operacion = input.nextInt();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (operacion) {
                case 1 -> {
                    System.out.println("SUMAR");
                    System.out.print("num 1: ");
                    float sumNum1 = input.nextFloat();
                    System.out.print("num 2: ");
                    float sumNum2 = input.nextFloat();
                    System.out.println("resultado: " + calculadora.sumar(sumNum1, sumNum2));
                }
                case 2 -> {
                    System.out.println("RESTAR");
                    System.out.print("num 1: ");
                    float restNum1 = input.nextFloat();
                    System.out.print("num 2: ");
                    float  restNum2 = input.nextFloat();
                    System.out.println("resultado: " + calculadora.resta(restNum1, restNum2));
                }
                case 3 -> {
                    System.out.println("MULTIPLICAR");
                    System.out.print("num 1: ");
                    float multNum1 = input.nextFloat();
                    System.out.print("num 2: ");
                    float multNum2 = input.nextFloat();
                    System.out.println("resultado: " + calculadora.multiplicacion(multNum1, multNum2));
                }
                case 4 -> {
                    System.out.println("DIVIDIR");
                    System.out.print("num 1: ");
                    float divNum1 = input.nextFloat();
                    System.out.print("num 2: ");
                    float divNum2 = input.nextFloat();
                    System.out.println("resultado: " + calculadora.division(divNum1, divNum2));
                }
                case 5 -> {
                    System.out.println("RAIZ CUADRADA");
                    float raizNum1 = input.nextFloat();
                    System.out.println("resultado: " + calculadora.raizCuadrada(raizNum1));
                }
                case 6 -> {
                    System.out.println("EXPONENCIAL");
                    float expNum1 = input.nextFloat();
                    int expNum2 = input.nextInt();
                    System.out.println("resultado: " + calculadora.exponencial(expNum1, expNum2));
                }
                default ->
                        System.out.println("  __    __       __       _______    _______   _______     _______   ________  ___________  ____  ____  ________   __          __       ________      ______  ________   \n" +
                                " /\" |  | \"\\     /\"\"\\     |   _  \"\\  /\"     \"| /\"      \\   /\"     \"| /\"       )(\"     _   \")(\"  _||_ \" ||\"      \"\\ |\" \\        /\"\"\\     |\"      \"\\    /    \" \\(\"      \"\\  \n" +
                                "(:  (__)  :)   /    \\    (. |_)  :)(: ______)|:        | (: ______)(:   \\___/  )__/  \\\\__/ |   (  ) : |(.  ___  :)||  |      /    \\    (.  ___  :)  // ____  \\\\___/   :) \n" +
                                " \\/      \\/   /' /\\  \\   |:     \\/  \\/    |  |_____/   )  \\/    |   \\___  \\       \\\\_ /    (:  |  | . )|: \\   ) |||:  |     /' /\\  \\   |: \\   ) || /  /    ) :) /  ___/  \n" +
                                " //  __  \\\\  //  __'  \\  (|  _  \\\\  // ___)_  //      /   // ___)_   __/  \\\\      |.  |     \\\\ \\__/ // (| (___\\ |||.  |    //  __'  \\  (| (___\\ ||(: (____/ // //  \\     \n" +
                                "(:  (  )  :)/   /  \\\\  \\ |: |_)  :)(:      \"||:  __   \\  (:      \"| /\" \\   :)     \\:  |     /\\\\ __ //\\ |:       :)/\\  |\\  /   /  \\\\  \\ |:       :) \\        / ('___/     \n" +
                                " \\__|  |__/(___/    \\___)(_______/  \\_______)|__|  \\___)  \\_______)(_______/       \\__|    (__________)(________/(__\\_|_)(___/    \\___)(________/   \\\"_____/   (___)     \n" +
                                "                                                                                                                                                                     ");
                case 7 -> {
                    System.out.println("      ___          _____                      ___           ___     \n" +
                            "     /  /\\        /  /::\\       ___          /  /\\         /  /\\    \n" +
                            "    /  /::\\      /  /:/\\:\\     /  /\\        /  /::\\       /  /:/_   \n" +
                            "   /  /:/\\:\\    /  /:/  \\:\\   /  /:/       /  /:/\\:\\     /  /:/ /\\  \n" +
                            "  /  /:/~/::\\  /__/:/ \\__\\:| /__/::\\      /  /:/  \\:\\   /  /:/ /::\\ \n" +
                            " /__/:/ /:/\\:\\ \\  \\:\\ /  /:/ \\__\\/\\:\\__  /__/:/ \\__\\:\\ /__/:/ /:/\\:\\\n" +
                            " \\  \\:\\/:/__\\/  \\  \\:\\  /:/     \\  \\:\\/\\ \\  \\:\\ /  /:/ \\  \\:\\/:/~/:/\n" +
                            "  \\  \\::/        \\  \\:\\/:/       \\__\\::/  \\  \\:\\  /:/   \\  \\::/ /:/ \n" +
                            "   \\  \\:\\         \\  \\::/        /__/:/    \\  \\:\\/:/     \\__\\/ /:/  \n" +
                            "    \\  \\:\\         \\__\\/         \\__\\/      \\  \\::/        /__/:/   \n" +
                            "     \\__\\/                                   \\__\\/         \\__\\/    ");
                    stop = true;
                }
            }
        }
    }
}
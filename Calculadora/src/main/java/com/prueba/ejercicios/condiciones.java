package com.prueba.ejercicios;

import java.util.Scanner;

public class condiciones {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();

        if (numero == 0) {

            for (int i = 0;i < 100;i++){

                System.out.print(i  + " ");
            }


        } else if (numero == 1 ){
            for (int i = 0;i < 100;i++){

                System.out.print(i  + 1 + " ");
            }
        }  else
            System.out.println("no existe");


    }

}

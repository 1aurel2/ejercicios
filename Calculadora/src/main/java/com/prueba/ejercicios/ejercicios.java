package com.prueba.ejercicios;

import javax.swing.*;
import java.util.Scanner;

public class ejercicios {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("¿que numero quieres ver?");
        System.out.print("numero 1 : ");
        int numero1 = input.nextInt();
        System.out.println();
        System.out.print("numero 2 : ");
        int numero2 = input.nextInt();


        if (numero1 < numero2) {

            for (int i = numero1; i <= numero2; i++) {

                System.out.print(i + " ");
            }
        } else if (numero1 > numero2) {
            for (int i = numero1; i >= numero2; i--) {

                System.out.print(i + " ");
            }
        }
    }
}
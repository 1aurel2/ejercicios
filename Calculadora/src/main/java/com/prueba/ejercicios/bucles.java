package com.prueba.ejercicios;

public class bucles {

    public static void main(String[] args) {

        for (int i = 0;i <= 100;i++){

            System.out.print(i + 200 + " ");
        }

        System.out.println();

        int i = 0;
        while (i <= 99){
            System.out.print(i+ 1 + " ");
            i++;
        }

        System.out.println();

       int e = 0;
        do {
            System.out.print(e+ 1 + " ");
            e++;
        } while (e <= 99);

        System.out.println();

        for (int b = 0; b < 3; b++){
            System.out.println("*");
        }

    }
}

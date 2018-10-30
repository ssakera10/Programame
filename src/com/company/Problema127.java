package com.company;

import java.util.Scanner;

public class Problema127 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String texto = teclado.nextLine();

        boolean[] descartado = new boolean[6];
        int numerocamas = 2;
        int numeropalabras = 3;

        for (int i = 1; i <= 3 ; i++) {

            if (i==3){
                descartado [3] = true;
            }

        }
    }
}

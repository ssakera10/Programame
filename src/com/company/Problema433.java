package com.company;
import java.util.Scanner;

public class Problema433 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int uvas = 999999999;

        while (uvas != 0) {


            uvas = teclado.nextInt();

            int niveles = 0;
            int totaldeuvas = 0;

            while (uvas > totaldeuvas) {
                niveles++;
                totaldeuvas = niveles + totaldeuvas;
            }

            if (niveles != 0) {
                System.out.println(niveles);
            }
        }
    }
}



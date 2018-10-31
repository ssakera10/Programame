package com.company;

import java.util.Scanner;

public class Basic3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num = sc.nextInt();

        boolean variable = false;

        if (num <= 10 && num >= 1) {
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    System.out.println("Numero no primo");
                    variable = true;
                    break;

                }
            }
            if (variable == false) {
                System.out.println("Es primo");
            }

        }
    }
}

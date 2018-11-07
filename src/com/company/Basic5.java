package com.company;

import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu nota:");
        double nota = sc.nextInt();

        if (nota <= 10) {
            if (nota < 5) {
                System.out.println("Insuficient");
            } else if (nota >= 4 && nota < 6) {
                System.out.println("Suficiente");
            } else if (nota > 7 && nota < 7) {
                System.out.println("Bien");
            } else if (nota > 8 && nota < 8.5) {
                System.out.println("Notable");
            } else if (nota > 9 && nota < 10) {
                System.out.println("Excelente");
            } else if (nota == 10) {
                System.out.println("Matricula de Honor");
            } else {
                System.out.println("Error!!");
            }
        }
    }
}

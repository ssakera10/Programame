package com.company;

import java.util.Scanner;

public class ExamenExaple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce segundos");

        int segundos = sc.nextInt();
        int tiempototal = 0;
        while (segundos != 0) {
            tiempototal = tiempototal + sc.nextInt();
        }
        System.out.println("Segundos entre el primero y ultimo coche: " + tiempototal);
    }
}


package com.company;

import java.util.Scanner;

public class Basic1 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce año");
        int year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 == 0 ){
                System.out.println("Este año no es bisiesto");
            }else {
                System.out.println("Es año Bisiesto");
            }
            System.out.println("Es año Bisiesto");
        } else {
            System.out.println("Este año no es bisiesto");
        }
    }
}
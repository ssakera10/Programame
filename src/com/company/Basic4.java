package com.company;

import java.util.Scanner;

public class Basic4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = sc.nextInt();
        sc.nextLine();

        int resto = (num1%num2);
        int restos = (num2%num1);

        if (num1 <= num2) {
            if (restos == 0){
                System.out.println(num1 + " es multiplo de " + num2);
            }else {
                System.out.println(num1 + " no es multiplo de " + num2);
            }
        }else {
            if (resto == 0){
                System.out.println(num1 + " es multiplo de " + num2);
            }else {
                System.out.println(num1 + " no es multiplo de " + num2);
            }
        }
    }

}


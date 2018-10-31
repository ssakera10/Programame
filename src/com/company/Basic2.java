package com.company;
import java.util.Scanner;

public class Basic2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = sc.nextInt();

        System.out.println("Introduce Operacion:");
        int operacion = sc.nextInt();

        if (operacion == 1){
            System.out.println(num1 + "+" +num2);
        }else if (operacion == 2){
            System.out.println(num1 + "*" + num2);
        }else {
            System.out.println("Error de Operacion");
        }
    }
}

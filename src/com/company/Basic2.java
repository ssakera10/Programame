package com.company;
import java.util.Scanner;

public class Basic2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero:");
        int num1 = sc.nextInt();
        System.out.println("Introduce otro numero:");
        int num2 = sc.nextInt();

        sc.nextLine();

        System.out.println("Introduce Operacion:");
        String operacion = sc.nextLine();


        if (operacion.equals("*")){
            System.out.println("Resultado: " + (num1 * num2));
        }else if (operacion.equals("+")){
            System.out.println("Resultado: " + (num1 + num2));
        }else {
            System.out.println("Error de Operacion");
        }
    }
}

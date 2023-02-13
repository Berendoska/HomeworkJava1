package org.example;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Double n, d, result;

        Scanner nScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        n = nScanner.nextDouble();

        Scanner dScanner = new Scanner(System.in);
        System.out.println("Введите второе число: ");
        d = dScanner.nextDouble();

        Scanner chScanner = new Scanner(System.in);
        System.out.println("Введите операцию + или - или / или *: ");
        String ch = chScanner.nextLine();


        switch (ch) {
            case "+":
                result = n + d;
                System.out.println(n + "+" + d + "=" + result);
                break;

            case "-":
                result = n - d;
                System.out.println(n + "-" + d + "=" + result);
                break;

            case "/":
                result = n / d;
                System.out.println(n + "/" + d + "=" + result);
                break;


            case "*":
                result = n * d;
                System.out.println(n + "*" + d + "=" + result);
                break;
            default:
                System.out.println("The operator you have selected is invalid");
                break;
        }
    }
}





















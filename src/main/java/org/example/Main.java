package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nScanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = nScanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int count = 1;
        int result = 1;
        for (int i = 0; i < arr.length; i++) {

            count = count + arr[i + 1];
            result = result * arr[i + 1];

                System.out.println(count + " " + "Треугольное");

                System.out.println(result + " " + "Factorial");

        }

    }

}


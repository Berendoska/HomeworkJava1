package org.example;


public class Simple {
    public static void main(String[] args) {
        int n = 1000;

        boolean isPrime = true;
        for (int j = 2; j <= n; j++) {
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                System.out.print(j + " ");
            else isPrime = true;
        }
    }

}


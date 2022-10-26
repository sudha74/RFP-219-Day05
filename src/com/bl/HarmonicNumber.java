package com.bl;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of P");
        float P = scanner.nextInt();
        float Q = 0.0f;
        if (P > 0) {
            for (float i = 1.0f; i <= P; i++) {
                Q = Q + (1 / i);
            }
            System.out.println(Q);
        } else {
            System.out.println("Enter the positive Number");
        }
    }
}



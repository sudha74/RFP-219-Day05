package com.bl;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Values");
        int N = scanner.nextInt();
        int n = scanner.nextInt();
        int quotient = N / n;
        System.out.println("Quotient =" + quotient);
        int remainder = N % n;
        System.out.println("Remainder =" + remainder);
    }
}

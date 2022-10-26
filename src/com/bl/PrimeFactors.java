package com.bl;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int N = scanner.nextInt();
        System.out.println("Prime Factors are: ");
        for (int i = 2; i <= N; i++) {
            if (N % 2 == 0) {
                System.out.println(i + " ");
            }
        }
        if (N < 1) {
            System.out.println(N);
        }
    }
}

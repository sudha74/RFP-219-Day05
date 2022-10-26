package com.bl;

import java.util.Scanner;

public class WindChill {
    static void WindChill() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature T and Speed of Wind V");
        int T = scanner.nextInt();
        int V = scanner.nextInt();
        double W = 35.74 + 0.6215 * T + (0.4275 * T - 35.75) * (Math.pow(V, 0.16));
        System.out.println(W);
    }

    public static void main(String[] args) {
        WindChill();
    }
}

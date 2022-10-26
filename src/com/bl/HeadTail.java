package com.bl;

import java.util.Scanner;

public class HeadTail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of Times to Flip a Coin");
        double d = scanner.nextInt();
        int H = 0;
        int T = 0;
        if (d > 0) {
            for (int i = 0; i < d; i++) {
                float value = (float) (Math.random() % 2);
                if (value > 0.5) {
                    System.out.println("TAILS");
                    T++;
                } else {
                    System.out.println("HEADS");
                    H++;
                }
            }
            float TailPercent = (float) ((T * 100) / d);
            float HeadPercent = (float) ((T * 100) / d);
            System.out.println("Enter Tail Percent");
            System.out.println("Enter Head Percent");
        } else {
            System.out.println("Enter the Positive Number");
        }
    }
}

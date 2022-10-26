package com.bl;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        System.out.println("Before Swapping");
        System.out.println("N1 =" + N1);
        System.out.println("N2 =" + N2);
        int temp = N1;
        N1 = N2;
        N2 = temp;
        System.out.println("After Swapping");
        System.out.println("N1 =" + N1);
        System.out.println("N2 =" + N2);
    }
}

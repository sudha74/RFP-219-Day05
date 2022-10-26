package com.bl;

import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Numbers");
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
        if (N1 > N2 && N1 > N3) {
            System.out.println("N1 is Largest Number");
        } else if (N2 > N3 && N2 > N1) {
            System.out.println("N2 is Largest Number");
        } else if (N3 > N1 && N3 > N2) {
            System.out.println("N3 is Largest Number");
        } else {
            System.out.println("All are Equal");
        }
    }
}

package com.bl;

import java.util.Scanner;

public class TwoDimArray {
    static void TwoDimArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of rows m");
        int m = scanner.nextInt();
        System.out.println("Enter the values of coloumns n");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("o/p");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("arr[" + i + "][" + j + "]= " + arr[i][j]);
            }
        }

    }

    public static void main(String[] args) {
        TwoDimArray();
    }
}


package com.bl;

import java.util.Scanner;

public class SumOfIntegers {
    static void sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of N: ");
        int N = scanner.nextInt();
        int[] arr = new int[N];
        int count = 0;
        int found = 0;
//        for (int i=0; i<N; i++) {
//            arr[i] = scanner.nextInt();
//        }
        for (int i = 0; i < N - 2; i++) {
            for (int j = i; j < N - 1; j++) {
                for (int k = i + j; k < N; k++) {
                    if ((arr[i] + arr[j] + arr[k] == 0)) {
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                        found = 1;
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets are :" + count);
        if (found != 0) {
            System.out.println("Found");
            if (found == 0) {
                System.out.println("Not Found");
            }
        }
    }

    public static void main(String[] args) {
        sum();
    }
}

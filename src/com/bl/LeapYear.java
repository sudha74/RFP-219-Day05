package com.bl;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = scanner.nextInt();
        if (year % 4 == 0 && year % 400 == 0) {
            System.out.println(year + " is LeapYear");
        } else {
            System.out.println(year + " is Not LeapYear");
        }
    }
}

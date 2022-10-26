package com.bl;

import java.util.Scanner;

public class Quadratic {
    static void roots(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter values of a,b,c");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        float delta = b^2-4*a*c;
        if (delta>0){
            System.out.println("Roots does not exist and are imaginary");
        }
//        else if(delta==0){
//            System.out.println("Roots are real and are equal");
//
//        }else if(delta<0){
//            System.out.println("Roots are Complex and different");
//        }
        else {
            float x1= (float) ((-b + Math.sqrt(delta)) / (2*a));
            System.out.println("Root 1 is : " +x1);
            float x2= (float) ((-b + Math.sqrt(delta)) / (2*a));
            System.out.println("Root 2 is : " +x2);
        }
    }

    public static void main(String[] args) {
        roots();
    }
}

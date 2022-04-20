package com.java.class05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        System.out.println("Please enter 2 numbers ");
        Scanner cookie = new Scanner(System.in);

        String c = cookie.nextLine();
        int number1 = cookie.nextInt();
        int number2 = cookie.nextInt();

        if (number1 > number2) {
            System.out.println("Number "+ number1 + " is GREATER than Number " + number2);
        }
        if (number1 < number2) {
            System.out.println("Number " + number2 + " is GREATER than Number " + number1);
        }
        else System.out.println("Both Number are EQUAL");

    }
}

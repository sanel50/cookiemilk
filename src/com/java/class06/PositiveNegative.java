package com.java.class06;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner cookie = new Scanner(System.in);

        System.out.println("Please enter any number");
        int num = cookie.nextInt();

        if (num >= 1) System.out.println("Number is positive");

        else if (num <= -1) System.out.println("Number is negative");

        else System.out.println("Number is Zero");
    }
}

package com.java.class05;

import java.util.Scanner;

public class IfElseExercise1 {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.println("Please enter two numbers:\n");
        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();


        System.out.println("1. Start");

        if (number1 > 0 && number2 > 0) {
            System.out.println("2. Positive\n");
        }
        else System.out.println("2. Negative\n");

        System.out.println("3. End");

    }
}

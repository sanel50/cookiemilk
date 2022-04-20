package com.java.homework;

import java.util.Scanner;

public class Class05 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Please Enter A Year:");
        int year = numbers.nextInt();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {      isLeap = year % 400 == 0;       }
            System.out.println(year + " is a Leap Year.");
        }

        else System.out.println(year + " is not a Leap Year.");


        System.out.println("\n\nPlease Enter A Number:");
        int number = numbers.nextInt();

        if (number % 5 == 0){
            System.out.println(number + " Is Dividable By 5");
        }

        else System.out.println(number + " Is Not Dividable By 5");



    }
}
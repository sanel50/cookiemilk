package com.java.class16;

//Write a program to check given number is prime or not

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println("Please enter a number");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("The " + num + " is not a prime number");
        }
        
        else if (num == 2) System.out.println("The " + num + " is a prime number");

        else System.out.println("The " + num + " is a prime number");

    }
}

package com.java.homework;


import java.util.Scanner;

//print prime numbers from 1 - 50
public class Class17PrintPrimeNum1To50 {
    public static void main(String[] args) {

        //From Chirag

        Scanner cookie = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = cookie.nextInt();

        for (int a = 1; a <= number; a++){
            if (isPrime(a) == true) {
                System.out.println(a);
            }
        }
    }

    static boolean isPrime(int num){
        int count = 0;

        for (int a = 1; a <= num; a++){
            if (num % a == 0){
                count++;
            }
        }

        if (count == 2){
            return true;
        }
        else {
            return false;
        }
    }

        /*int num = 0;
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }*/


    }


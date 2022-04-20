package com.java.homework;

//  Find out the result of the below series

//  1   *   2   *   3   *   4   *   5

public class Class12 {
    public static void main(String[] args) {

        int factorial = 1;

        for (int i = 1; i <= 5; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

    }
}

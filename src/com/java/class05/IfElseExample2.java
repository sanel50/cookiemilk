package com.java.class05;

public class IfElseExample2 {
    public static void main(String[] args) {
        int num = 6;

        if (num > 0) {
            //Positive   13
            if (num % 2 == 0) {              //Positive and Even

                System.out.println("Positive and Even");
            } else {
                //Positive and Odd
                System.out.println("Positive and Odd");
            }
        } else if (num < 0) {
            System.out.println("Negative and Even");

            if (num % 2 == 1) {
                //Negative and Odd
                System.out.println("Negative and Odd");


            } else {
                //Zero       0
                System.out.println("Zero");
            }

        }
    }
}

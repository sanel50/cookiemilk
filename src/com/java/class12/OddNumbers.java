package com.java.class12;

public class OddNumbers {
    public static void main(String[] args) {

        System.out.println("\n\n\t\tFirst Method for ODD NUMBERS");
        for (int i = 10; i >= 1; i--){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        System.out.println("\t\tSecond Method for ODD NUMBERS");
        for (int i = 9; i >= 1; i -=2){
            System.out.println(i);
        }

    }
}

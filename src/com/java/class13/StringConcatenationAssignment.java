package com.java.class13;

/*
    Take one String and two int variables
    Print add of two numbers with concatenation with String
 */

public class StringConcatenationAssignment {
    public static void main(String[] args) {

        String c = "Cookie";

        int a = 1, b = 5;

        System.out.println(a + b + c);                  //6Cookie
        System.out.println(c + (a + b));                //Cookie6
        System.out.println(c + a + b);                  //Cookie15


        System.out.println(c.toUpperCase());            //COOKIE


    }
}

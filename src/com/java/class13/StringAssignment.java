package com.java.class13;


import java.util.Scanner;

/*

    Create three String variables
        initialize two variables with constant value
        take third variables value from user using Scanner class
        compare 1st and 2nd using == operator
        compare 2nd and 3rd using == operator
        compare 1st and 3rd using == .equals() method

 */
public class StringAssignment {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a word");

        String s1 = "Cookie";
        String s2 = "Milk";
        String s3 = s.next();

        if (s1 == s2){
            System.out.println("True");
        }
        else System.out.println("False");



        if (s2 == s3){
            System.out.println("True");
        }
        else System.out.println("False");



        if (s3.equals(s1)){
            System.out.println("True");
        }
        else System.out.println("False");


    }
}

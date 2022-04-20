package com.java.class13;

import groovy.json.JsonOutput;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("\t--- First Method ---");
        String str1 = "Hello";
        String str2 = "Hello";
                                                                        //True
        if (str1 == str2) {
            System.out.println("True");
        }
        else System.out.println("False");


        System.out.println(str1 + " " + str2 + " Will be true because we used normal String with == sign");
        //Here were storing constant value "Hello" into String Variable so it will get store into String pool memory
        //When we compare String with '==' it'll just compare the memory location of two String




        System.out.println("\n\t--- Second Method ---");

        String strA = "Hello";
        String strB = new String("Hello");
                                                                        //False
        if (strA == strB) {
            System.out.println("True");
        }
        else System.out.println("False");

        //If we did put the equal it will be true


        System.out.println(strA + " " + strB + " Will be false because we used one normal String another creating object of String with == sign");
        //Here were creating object of String with value "Hello" so it will get stored into heap memory




        System.out.println("\n\t--- Third Method ---");
        System.out.println("Please enter a word");

        String str3 = "Hello";
        String str4 = scan.next();
                                                                        //False
        if (str3 == str4) {
            System.out.println("True");
        }
        else System.out.println("False");


        System.out.println(str3 + " " + str4 + " Will be false because we used two normal string but we used scanner for this method with == sign");
        // Here we're trying to get value "Hello" from user using scanner class so it'll also get stored into heap memory




        System.out.println("\n\t--- Forth Method ---");
        System.out.println("Please enter a word");

        String strC = "Hello";
        String strD = new String (scan.next());
                                                                        //True

        if (strC.equals(strD)) {
            System.out.println("True");
        }
        else System.out.println("False");




        System.out.println("\n\t--- Fifth Method ---");

        String str5 = "Hello";
        String str6 = "Hello";
        str5 = "DevX";

                                                                        //False

        if (str5.equals(str6)) {
            System.out.println("True");
        }
        else System.out.println("False");



        System.out.println("\n\t--- Sixth Method ---");

        String strE = "Hello";
        String strF = "Hello";


                                                                        //True

        if (strE == strF) {
            System.out.println("True");
        }
        else System.out.println("False");




    }
}

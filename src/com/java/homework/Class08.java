package com.java.homework;

import java.util.Scanner;

public class Class08 {
    public static void main(String[] args) {

        Scanner milk = new Scanner(System.in);

        System.out.println("\t\t----- Task 1 -----");
        /*
            Write a java program to get marks from users and print grades based on marks (feel free to use any statements)
                If marks are from 90 to 100 Print A
                If marks are from 80 to 89 Print B
                If marks are from 70 to 79 Print C
                If marks are from 60 to 69 Print D
                If marks are from 50 to 59 Print E
                If marks are from 0 to 49 Print Fail
         */

        System.out.println("Please enter your GRADE");
        double grade = milk.nextDouble();

        if (grade >= 90 && grade <= 100) System.out.println("You grade is \"A\"");

        else if (grade >= 80 && grade <= 89) System.out.println("You grade is \"B\"");

        else if (grade >= 70 && grade <= 79) System.out.println("You grade is \"C\"");

        else if (grade >= 60 && grade <= 69) System.out.println("You grade is \"D\"");

        else if (grade >= 50 && grade <= 59) System.out.println("You grade is \"E\"");

        else System.out.println("You \"FAILED\"");

        System.out.println("password incorrect");

        System.out.println("\n\n\t\t----- Task 2 -----");
        /*
            Write a program to get T-shirt size in inches and print size based on inches
                If inches is 27 to 30 Print XS
                If inches is 31 to 34 Print S
                If inches is 35 to 38 Print L
                If inches is 39 to 42 Print XL
                If inches is 45 to 50 Print XXL
         */

        System.out.println("Please enter your size in INCH");
        int size = milk.nextInt();

        if (size >= 27 && size <= 30) System.out.println("You`r size is \"XS\"");

        else if (size >= 31 && size <= 34) System.out.println("You`r size is \"S\"");

        else if (size >= 35 && size <= 38) System.out.println("You`r size is \"L\"");

        else if (size >= 39 && size <= 42) System.out.println("You`r size is \"XL\"");

        else if (size >= 45 && size <= 50) System.out.println("You`r size is \"XXL\"");

        else System.out.println("You`r size is \"UNAVAILABLE\"");




        System.out.println("\n\n\t\t----- Task 3 -----");
        /*
            Write a program to take number from user and check if it's divisible by 5 or 3
         */


        System.out.println("Please enter a NUMBER to Divide it by 5 or 3");
        int number = milk.nextInt();

        if (number % 5 == 0 || number % 3 == 0)
            System.out.println("\"" +number + "\" Dividable by \"5\" and \"3\"");

        else if (number % 5 != 0 || number % 3 == 0)
            System.out.println("\"" + number + "\" Dividable by \"3\" and not Dividable by \"5\"");

        else if (number % 5 == 0 || number % 3 != 0)
            System.out.println("\"" + number + "\" Dividable by \"5\" and not Dividable by \"3\"");

        else System.out.println("not Dividable by 5 or 3");

    }
}

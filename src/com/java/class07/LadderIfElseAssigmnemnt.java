package com.java.class07;

/*
        take one number from user (keyboard)
        90 to 100 then grade a
        80 to 89 then grade b
        70 to 79 then grade c
        60 to 69 then grade d
        50 to 59 then grade e
        0 to 49 then grade fail
 */

import java.util.Scanner;

public class LadderIfElseAssigmnemnt {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your grade");
        int grade = s.nextInt();

        if (90 < grade) System.out.println("You got an A");
        else if (80 < grade) System.out.println("You got an B");
        else if (70 < grade) System.out.println("You got an C");
        else if (60 < grade) System.out.println("You got an D");
        else if (50 < grade) System.out.println("You got an E");
        else System.out.println("You FAILED");
    }
}

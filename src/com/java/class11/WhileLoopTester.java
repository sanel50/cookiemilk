package com.java.class11;

import java.util.Scanner;

public class WhileLoopTester {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number to have a limit");

        int limit = s.nextInt();
        int i = 1 , j = 1;

        while (i <= limit / 2){
            System.out.println(11 - i);
            System.out.println(j);
            i++;
        }


    }
}

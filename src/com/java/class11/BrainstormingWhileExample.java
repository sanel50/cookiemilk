package com.java.class11;

// write a program to print below numbers

// 6 12 18 24 30 36 42 48 54 60

import java.util.Scanner;

public class BrainstormingWhileExample {
    public static void main (String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Please enter how many numbers we need to print");
        int a = s.nextInt();

        int i = 1;

        while (i <= a) {
            System.out.println(6 * i );
            i++;
        }

    }
}

package com.java.class12;


// write a program to print a numbers that ar not divisible by 3 or 7

import java.util.Scanner;


public class HomeworkClass11 {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);


        System.out.println("Please enter a number");

        int i = 1 ,num = s.nextInt();

        while (1 <= num) {
            if(i % 3 != 0 && i % 7 == 0 ) {
                    System.out.println(i);
            }
            i++;
        }
    }
}

package com.java.class15;

import java.util.Scanner;

//write a program to print 2nd half of string

public class PrintSecondHalfOfString {
    public static void main(String[] args) {

        System.out.println("Enter any String");

        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();


        if (s1.length() % 2 == 0){
            s1 = s1.substring(s1.length()/2);
        }
        else if (s1.length() % 2 == 1) {
            s1 = s1.substring((s1.length()/2)+1);

        }

        System.out.println(s1);


    }
}

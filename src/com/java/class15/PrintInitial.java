package com.java.class15;

//Take full name from user and print initials of it

import java.util.Scanner;

public class PrintInitial {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Please enter your Full Name");
        String fullName = name.nextLine();

        String word[] = fullName.split(" ");


        for (int f = 0; f < fullName.length(); f++) {
            System.out.print(word[f].charAt(0) + ".");
        }




    }
}

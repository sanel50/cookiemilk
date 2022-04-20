package com.java.class16;

//write a program to take one string from user and print
// occurrence of given char in string

// input - this is my java program
// output - -3

import java.util.Scanner;

public class FindOccurrenceOfChar {
    public static void main(String[] args) {

        System.out.println("Please enter a sentence");
        Scanner s = new Scanner(System.in);

        //"This is my java program"

        String str = s.nextLine();
        char c = 'a';

        int ce =0;
        for(int i=0; i< str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                ce++;
            }
        }
        System.out.println(ce);


    }
}

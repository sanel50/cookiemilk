package com.java.class16;

/*

    write a program to take ine statment
 */

import java.util.Scanner;

public class StringPracticeWordCount {
    public static void main(String[] args) {


        System.out.println("Please enter a sentence");

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        System.out.println("\n\tFirst Method");
        String [] words = s.split(" ");

        System.out.println("Length of the sentence is: " + words.length);



        System.out.println("\n\tSecond Method");
        //for loop

        int plus = 1;

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ' '){
                plus++;
            }
        }
        System.out.println("Length of the sentence is: " + plus);


    }
}

package com.java.class08;

import java.util.Scanner;

public class VowelLetterWithIfStatement {
    public static void main(String[] args) {

        Scanner milk = new Scanner(System.in);

        System.out.println("Please enter a LETTER");
        char letter = milk.next().charAt(0);


        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("The letter is a VOWEL letter");
        }
        else System.out.println("Its not a VOWEL letter");

    }
}

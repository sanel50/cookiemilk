package com.java.class15;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Enter any String");
        Scanner s = new Scanner(System.in);
        String string = s.nextLine();


        String[] words = string.split("");

        for (int i = words.length -1; i >= 0; i--) {
            System.out.print(string.charAt(i));
        }

        System.out.println("Enter any String: ");
        String str = s.nextLine();
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }

       System.out.println(rev);
    }
}

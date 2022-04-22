package com.java.class18;


//write a program ro check given String is palindrome or not


import java.util.Scanner;

public class CheckPalindrome {
    static void isPalindrome(String str){
        String revStr = "";
        int strLength = str.length();

        for (int i = (strLength - 1); i >= 0; --i) {
            revStr = revStr + str.charAt(i);
        }

        if (str.equalsIgnoreCase(revStr)) {
            System.out.println(str + " is a Palindrome String.");
        }

        else System.out.println(str + " is not Palindrome String.");
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any word");

        String str = scan.nextLine();

        isPalindrome(str);
    }

    static String getReverse(String str){

        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
            }

            return rev;

    }

}


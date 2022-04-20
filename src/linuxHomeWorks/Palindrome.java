package linuxHomeWorks;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a Word / Number:");

        String string = s.nextLine() , reverseStr = "";

        int strLength = string.length();

        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + string.charAt(i);
        }

        if (string.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(string + " is a Palindrome String.");
        }
        else {
            System.out.println(string + " is not a Palindrome String.");
        }

    }
}

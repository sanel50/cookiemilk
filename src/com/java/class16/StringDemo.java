package com.java.class16;
//all task/programs are running parallel which is why we use sBuffer.

import java.util.Scanner;


public class StringDemo {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String str ="Hello";

    // String buffer uses the buffer mechanism to protect data from being
    // access and update simultaneously, so it's thread-safe

    StringBuffer sBuffer = new StringBuffer("Hello");
        sBuffer.reverse();

    StringBuilder sBuilder = new StringBuilder("Hello");
        sBuilder.reverse();
    }
}

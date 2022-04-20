package com.java.class11;

import java.util.Scanner;


// 2 4 6 8 10 12
public class WhileLoopAnalysis {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number to have a limit");

        int b = s.nextInt();
        int i = 1;

        while (i <= b){
            System.out.println(i * i);
            i++;
        }
    }
}

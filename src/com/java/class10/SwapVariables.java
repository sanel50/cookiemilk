package com.java.class10;

import java.util.Scanner;

public class SwapVariables {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);




        System.out.println("please enter two number");
        int a = s.nextInt(), b = s.nextInt() , c;



        c = a;
        a = b;
        b = c;

        //without using third variable
        a = a + b;
        a = a - b;
        a = a + b;

        //without using third variable



        System.out.println(a);
        System.out.println(b);
    }
}

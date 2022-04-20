package com.java.class17;

import java.util.Locale;
import java.util.Scanner;



public class MethodExample {

    static void printLine(int length, char c){
        for (int i = 1; i <= length; i++)
        System.out.print(c);
    }
    static void printName(){
        String cookie = "Cookie";
        if (cookie != cookie){
            System.out.print("Not Milk");
        }
        else{
            System.out.print("Milk");
        }
    }

    public static void main(String[] args) {


        printLine(3 , '*');
        System.out.println("Please Enter First Number: ");                  printLine(3 , '*');

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        printLine(3 , '*');
        System.out.println("Please Enter Second Number: ");                 printLine(3 , '*');

        int b = sc.nextInt();

        System.out.println("Please Enter The Operation (+ | - | / | *)");
        String operation = sc.next();
        printLine(1 , '=');

        switch (operation){        //to make it all lower case .toLowerCase(Locale.ROOT)
            case "+":
                System.out.println(a +" + " + b + " = " +(a+b));
                break;
            case "-":
                System.out.println(a +" - " + b  + " = " + (a-b));
                break;
            case "/":
                System.out.println(a +" / " + b + " = "  + (a/b));
                break;
            case "*":
                System.out.println(a +" * " + b  + " = "  + (a*b));
                break;

            default:
                System.out.println("Invalid choice...please try after hangout");
        }

        printName();            //for testing static voids
    }
}

package com.java.class08;


import java.util.Scanner;

// Take three numbers from user and print max number out of numbers
public class MaxOutThreeNumbers {
    public static void main(String[] args) {

        Scanner milk = new Scanner(System.in);

        System.out.println("Please Enter A Number");
        int n1 = milk.nextInt();

        System.out.println("Please Enter A Number");
        int n2 = milk.nextInt();

        System.out.println("Please Enter A Number");
        int n3 = milk.nextInt();

        if (n1 > n2 && n1 > n3){
            System.out.println("First number " + n1 + " is greatest of the Second number "+ n2 + " and the Third number " + n3);
        }



        else if (n2 > n1 && n2 > n3){
            System.out.println("Second number " + n2 + " is greatest of the First number "+ n1 + " and the Third number " + n3);
        }


        else if (n3 > n1 && n3 > n2) System.out.println("Third number " + n3 + " is greatest of the First number " + n1 + " and the Second number " + n2);

        else if (n1 == n2 && n1 == n3){
            System.out.println("First number \"" + n1 + "\" and Second number \"" + n2 + "\" and Third Number" + n3 + " are the equal ");


        }
    }
}

package com.java.class06;

/*
    nested condition / nested if else
    write a program to print eligibility for blood donation based on
        1. age      =   >= 18
        2. weight   =   >= 100 lb
 */


import java.util.Scanner;

public class BloodDonation {
    public static void main(String[] args) {

        Scanner blood = new Scanner(System.in);


        //Input
        System.out.println("Please Enter Your Age");
        int age = blood.nextInt();

        System.out.println("Please Enter Your Weight");
        double weight = blood.nextDouble();



        if (age >= 18) {

            if (weight >= 100)
                System.out.println("You're Eligible For Age & Weight Requirement");


            else {
                System.out.println("You're UNDER Weight Requirement");
            }
        }
        else {
            if (weight >= 100)
            System.out.println("You're Young For Age Requirement");
            else System.out.println("You're TOTALLY NOT Eligible Requirement");
        }




    }
}

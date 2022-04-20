package com.java.homework;


import java.util.Scanner;

public class Class07 {
    public static void main(String[] args) {

        Scanner milk = new Scanner(System.in);

        System.out.println("\t\t----- Task 1 -----");

        /*
           Write a java program to Find Company name from the given product
           Possible inputs = {gmail, whatsapp, youtube, Skype, Hangouts, outlook}
           Possible Outputs = {google, facebook, microsoft}

         */

        System.out.println("Enter A Product Name From These Companies:" + "\n 1. Google \n 2. Meta \n 3. Microsoft");
        String findCompanyForProduct = milk.nextLine();

        switch (findCompanyForProduct){
            case "Youtube":
            case "Hangouts":
            case "Gmail":
            case "Sheet":
                System.out.println("Company is Google");
            break;

            case "Facebook":
            case "Whatsapp":
            case "Instagram":
            case "Messenger":
                System.out.println("Company is Meta");
            break;


            case "Windows":
            case "Microsoft Office":
            case "Outlook":
            case "Skype":
                System.out.println("Company is Microsoft");
            break;

            default:
                System.out.println("Please enter one of the given products");
        }


            System.out.println("\n\n\t\t----- Task 2 -----");
        /*
           Write a program to check given character is Vowel or Not
           Vowel characters are - 'a','e','i','o','u'
           (If you're not using scanner class it's fine you can directly take char value in program)
         */


        System.out.println("Enter A Vowel Letter:");
        char vowel = milk.next().charAt(0);

        switch (vowel) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(vowel + " The Letter Is Vowel");
                break;

            default:
                System.out.println(vowel + "This Is Not A VOWEL Letter");

        }



        System.out.println("\n\n\t\t----- Task 3 -----");
        /*
            Write a program to take username and password from user and print appropriate message based on below conditions
                1. If username correct and password correct ---> Login successful
                2. If username correct and password incorrect --> Invalid password
                3. If username incorrect and password correct --> Invalid username
                2. If username incorrect and password incorrect --> Login unsuccessful
         */

        String username = "CatLover";
        String password = "Cookie&Milk";


        System.out.println("Enter Username:");
        String usernameUser = milk.nextLine();


        System.out.println("Enter Password:");
        String passwordUser = milk.nextLine();

        if (username.equalsIgnoreCase(usernameUser) && (password.equalsIgnoreCase(passwordUser))) {
            System.out.println("Login Successful");
        }
        else if (username == usernameUser && password != passwordUser) {
            System.out.println("Invalid Password");
        }
        else if (username != usernameUser && password == passwordUser) {
            System.out.println("Invalid Username");
        }
        else System.out.println("Invalid Login");



    }
}

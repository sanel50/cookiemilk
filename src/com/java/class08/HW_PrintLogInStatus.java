package com.java.class08;


import java.util.Scanner;

public class HW_PrintLogInStatus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        //InPut
        System.out.println("Please enter your user name and password");
        String username = sc.nextLine(), password = sc.nextLine();
        String user = "Devx", pass = "School";


            //OutPut

        if ((username.equals(user)) && (password.equals(pass))) {
            System.out.println("Login Successful");
        }

        else if (username.equalsIgnoreCase(user) && (password.equals(pass))) {
            System.out.println("Invalid Username");
        }

        else if (username.equals(user) && (password.equalsIgnoreCase(pass))) {
            System.out.println("Invalid Password");
        }


        else if ((username.equalsIgnoreCase(user) && (password.equalsIgnoreCase(pass)))) {
            System.out.println("Login Unsuccessful");
        }


    }
}

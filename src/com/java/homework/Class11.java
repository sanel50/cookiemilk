package com.java.homework;

import java.util.Scanner;

public class Class11 {
    public static void main(String[] args) {
        System.out.println("\t\t--- Task 1 ---");

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter a number ");

        int user = s.nextInt();
        int n1 = 1 ;

        while (n1 <= user){
            System.out.println(user * n1);
            n1++;
        }



        System.out.println("\n\n\t\t--- Task 2 ---");

        int n2 = 1;

        while (n2 <= 50){
            if (n2 % 3 == 0 || n2 % 5 == 0)
            System.out.println( n2 );
            n2++;
        }






















        System.out.println("\n\n\t\t--- Task 3 ---");

        System.out.println("Please enter a number");

        int n31 = s.nextInt() , n32 = 1;

        while (n32 <= n31){
            if (n32 % 3 != 0 && n32 % 7 != 0) {
                System.out.println( n32 );
            }
            n32++;
        }


    }
}

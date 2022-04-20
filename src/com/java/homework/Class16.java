package com.java.homework;


import java.util.Scanner;

/*
        Find divisor of given number (Input - 6, output will be 1 2 3 6)                            //Done

        Find result of given series 1 + 2 – 3+ 4 + 5 – 6 + 7 + 8 – 9 +10                            //
 */
public class Class16 {
    public static void main (String [] args){

        System.out.println("\t\t--- Task 1 ---");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number");
        int n1 = scanner.nextInt(), n;

        for (n = 1; n <= n1; n++) {
            if (n1 % n == 0) {
                System.out.println(n);
            }
        }


        System.out.println("\n\n\t\t--- Task 2 ---");
        System.out.println("Find Result of given series");

        int sum = 0, n2;

        for (int m = 1; m <= 10; m++){
            if (m % 3 == 0){
                n2 = - m;
            }
            else {
                n2 = m;
            }

            sum += n2;
        }
        System.out.println("Sum of given Series is = " + sum);

    }
}

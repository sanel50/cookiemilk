package com.java.class17;

import java.util.Scanner;

public class PrintPrimeNumberFrom1to50 {

    static boolean primeNumber(int num){
        boolean isPrime = true;
        if (num <=1){
            isPrime = false;
            return isPrime;
        }
        else {
            for (int i = 2; i <= num/2; i++){
                if ((num % i) == 0){
                    isPrime = false;
                }
            }
            return isPrime;
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter A Number");
        int n1 = s.nextInt();

        boolean isPrime = primeNumber(n1);

        if (isPrime){
            System.out.println(n1 + " Is A Prime Number");
        }
        else{
            System.out.println(n1 + " Is Not A Prime Number");
        }
    }
}

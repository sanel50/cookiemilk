package com.java.class07;

import java.util.Scanner;

public class PriceDiscount {
    public static void main(String[] args) {

        Scanner cookie = new Scanner(System.in);

        System.out.println("Enter price to get the discount");
        double price = cookie.nextDouble();

        if (price < 100) {
            System.out.println("No Discount");
        }
        else if (price < 500) {
            System.out.println("%5 Discount");
        }
        else if (price < 1000) {
            System.out.println("%10 Discount");
        }
        else if (price <= 100) {
            System.out.println("%15 Discount");
        }
     }
}

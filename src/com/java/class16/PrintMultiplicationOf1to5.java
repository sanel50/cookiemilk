package com.java.class16;

public class PrintMultiplicationOf1to5 {
    public static void main(String[] args) {


        int multi = 1;

        for (int m = 1; m <= 5; m++){
            multi = multi * m;

            System.out.println(m);
        }
        System.out.println(multi);

    }
}

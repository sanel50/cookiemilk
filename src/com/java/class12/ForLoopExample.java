package com.java.class12;

public class ForLoopExample {
    public static void main(String[] args) {

        // need to review

        System.out.println("First Method");
        for(int i = 2; i <= 10 ; ++i){
            if (i % 2 == 0) {
                System.out.println(i);
            }      //  body
        }


        System.out.println("Second Method");
        for(int i = 2; i <= 10/2 ; ++i){
                System.out.println(i * 2);      //  body
        }


        System.out.println("Third Mehtod");
        for(int i = 1; i <= 10 ; i = i + 2){
                System.out.println(i * 2);      //  body
        }

    }
}

package com.java.class13;

public class StringConcatenation {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "DevX";

        int a = 10, b = 20, c = 5;

        System.out.println("Add" + a + b);                  //Add1020
        System.out.println("Add" + a + b + c);              //Add10205
        System.out.println("Add" + a + b * c);              //Add10100
        System.out.println(a + b + "Add");                  //30Add
        System.out.println(a + b + "Add" + a + b);          //30Add1020

        /*
        System.out.println(a + "Add" + b - c);

                        Error
                            we can't use minus in the string, but we can use it if we did put it in () or +-
                         */

        System.out.println(a + "Add" + (b - c));            //10Add15
        System.out.println(str1 + a + b + str2);            //Hello1020DevX


        System.out.println("Add" + "10" + "20" + "str1");   //Add1020str1
        System.out.println("a+b-c");                        //a+b-c




    }
}

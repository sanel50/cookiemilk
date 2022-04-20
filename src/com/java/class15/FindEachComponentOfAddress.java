package com.java.class15;


//Write a program to print each component of address into separate line
public class FindEachComponentOfAddress {
    public static void main(String[] args) {

        String address = "9213 Moody Ave, Oak Lawn, IL, 60453";

        String[] eachLine = address.split(", ");

        System.out.println("\tFirst Method");

        for (int i = 0; i < eachLine.length; i++){
            System.out.println("\t" + eachLine[i]);
        }

        System.out.println("\n\tSecond Method");
        System.out.println(eachLine[0].trim());
        System.out.println(eachLine[1].trim());
        System.out.println(eachLine[2].trim());
        System.out.println(eachLine[3].trim());

    }
}

package com.java.class07;

import java.util.Scanner;

public class NumberOfDaysInTheMonthsUsingSwitch {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        System.out.println("Please enter a month");
        String month = s.next();
        //int months = s.nextInt();

        switch (month){
            case "January":
                System.out.println("Month " + month + " is January and have 31 days");
                break;
            case "February":
                System.out.println("Month " + month + " is February and have 28 days");
                break;
            case "March":
                System.out.println("Month " + month + " is March and have 31 days");
                break;
            case "April":
                System.out.println("Month " + month + " is and have 30 days");
                break;
            case "May":
                System.out.println("Month " + month + " is May and have 31 days");
                break;
            case "June":
                System.out.println("Month " + month + " is June and have 30 days");
                break;
            case "July":
                System.out.println("Month " + month + " is July and have 31 days");
                break;
            case "August":
                System.out.println("Month " + month + " is August and have 31 days");
                break;
            case "September":
                System.out.println("Month " + month + " is September and have 30 days");
                break;
            case "October":
                System.out.println("Month " + month + " is October and have 31 days");
                break;
            case "November":
                System.out.println("Month " + month + " is November and have 30 days");
                break;
            case "December":
                System.out.println("Month " + month + " is December and have 31 days");
                break;

            default:
                System.out.println("This is not a month");

        }
        /*
        switch (months){
            case 1:
                System.out.println("Month " + months + " is January and have 31 days");
                break;
            case 2:
                System.out.println("Month " + months + " is February and have 28 days");
                break;
            case 3:
                System.out.println("Month " + months + " is March and have 31 days");
                break;
            case 4:
                System.out.println("Month " + months + " is and have 30 days");
                break;
            case 5:
                System.out.println("Month " + months + " is May and have 31 days");
                break;
            case 6:
                System.out.println("Month " + months + " is June and have 30 days");
                break;
            case 7:
                System.out.println("Month " + months + " is July and have 31 days");
                break;
            case 8:
                System.out.println("Month " + months + " is August and have 31 days");
                break;
            case 9:
                System.out.println("Month " + months + " is September and have 30 days");
                break;
            case 10:
                System.out.println("Month " + months + " is October and have 31 days");
                break;
            case 11:
                System.out.println("Month " + months + " is November and have 30 days");
                break;
            case 12:
                System.out.println("Month " + months + " is December and have 31 days");
                break;

            default:
                System.out.println("This is not a month");

        }
 */   }
}

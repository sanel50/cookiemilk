package practice;

import java.util.Scanner;

public class S {
    public static void main(String[] args) {

        //Take month name from yser and print number of
        //days in given month


        System.out.println(" enter your month");
        Scanner ado = new Scanner(System.in);
        String mont = ado.nextLine();

        switch (mont){
            case "JAN":
                System.out.println("31");
                break;

            case "FAB":
                System.out.println("29");
                break;
            case "MAR":
                System.out.println(" 30");
                break;
            case "APR":
                System.out.println("");
                break;
            case "MAY":
                System.out.println("31");
                break;
            case "JUN":
                System.out.println("30");
                break;
            case "JUL":
                System.out.println("31");
                break;
            case "AUG":
                System.out.println("31");
                break;
            case "SEP":
                System.out.println("30");
                break;
            case "OCT":
                System.out.println("31");
                break;
            case "NOV":
                System.out.println("30");
                break;

            case "DEC":
                System.out.println("31");
                break;
            default:
                System.out.println("please enter MONT");








        }
    }
}

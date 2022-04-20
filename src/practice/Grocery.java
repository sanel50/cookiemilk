package practice;

import java.util.Scanner;
import java.util.ArrayList;

public class Grocery {
    public static void main(String[] args) {



        Scanner userInput = new Scanner(System.in);

        ArrayList<String> user = new ArrayList<String>();

        System.out.println("Cookie and Milk");

        System.out.println("Please enter how many item you need to buy:");
        int howMany = userInput.nextInt();

        System.out.println("You want to buy " + howMany + " items\n");


        System.out.println("Please list the items");

        String item1 = userInput.next();


        System.out.println(item1);
    }
}

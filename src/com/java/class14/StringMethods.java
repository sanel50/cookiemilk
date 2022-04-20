package com.java.class14;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String s = "Hello World";
        String t = "hello World";
        String r = "Hello World! Welcome to DevX!";



        System.out.println("\t--- 1. Equality ---");
        //1. Check quality of two String
        System.out.println("With .equals():");
        System.out.println("\t" + s.equals(t));


        System.out.println("\n\n\t--- 2. Equality ---");
        //2. Check quality of two String Ignoring case
        System.out.println("With .equalsIgnoreCase():");
        System.out.println("\t" + s.equalsIgnoreCase(t));



        System.out.println("\n\n\t--- 3.1 Contains ---");
        //3. Check one String contains another string
        System.out.println("With .contains():");
        System.out.println("\t" + s.contains(r));



        System.out.println("\n\n\t--- 3.2 Contains ---");
        //3.2. Check one String contains another string
            //Contain will check one String contains another String considering case-sensitive
        System.out.println("With .contains():");
        System.out.println("\t" + r.contains(s));
        System.out.println("\t" + r.contains(t));



        System.out.println("\n\n\t--- 4.1 Contains With UpperCase ---");
        //4.1 Check one String contains another string
            //Contain will check one String contains another String considering case-sensitive
        System.out.println("With .contains(.toUpperCase()):");
        System.out.println("\t" + r.toUpperCase().contains(s.toUpperCase()));
        System.out.println("\t" + r.toUpperCase().contains(t.toUpperCase()));




        System.out.println("\n\n\t--- 4.2 Contains With LowerCase  ---");
        //4.2 Check one String contains another string with all lower case
            //If we want check one String contains another String ignoring case then we have to change
            //both String in same case and then check contains, so it`ll check only content of both String

        System.out.println("With .toLowerCase():");
        String rLowerCase = r.toLowerCase();
        String tLowerCase = t.toLowerCase();
        System.out.println("\t" + (rLowerCase.contains(tLowerCase)));




        System.out.println("\n\n\t--- 5. Changing The Case With UpperCase & LowerCase  ---");
        //5. Changing the case of String
        System.out.println("With .toUpperCase:");
        System.out.println("\t" + r.toUpperCase());
        System.out.println("With .toLowerCase:");
        System.out.println("\t" + r.toLowerCase());




        System.out.println("\n\n\t--- 6. Find Index Of Charector  ---");
        //6. find index of char
        s = "Hello World";
        r = "Hello World! Welcome to DevX!";

        System.out.println("Index of Char:");
        System.out.println("\t" + s.indexOf('l'));

        System.out.println("Last Index of Char:");
        System.out.println("\t" + r.lastIndexOf('l'));        //lastIndexOf = the last letter alphabet




        System.out.println("\n\n\t--- 7. Find Charector At Index ---");
        //7. find char at index
        s = "Hello World";
        System.out.println("Index of Char:");
        System.out.println("\t" + s.charAt(0));




        System.out.println("\n\n\t--- 8. Length Of String ---");
        //8. Length of String
        s = "Hello World";
        r = "Hello World! Welcome to DevX!";

        System.out.println("Length of String:");
        System.out.println("\t" + s.length());

        System.out.println("Length of String:");
        System.out.println("\t" + r.length());




        System.out.println("\n\n\t--- 9. Empty and Blank ---");
        //9. Empty and Blank
        s = "                   ";
        r = "";

        System.out.println("Empty:");
        System.out.println("\t" + s.isEmpty());

        System.out.println("Empty:");
        System.out.println("\t" + r.isEmpty());


        System.out.println("Empty");
        System.out.println("\t" + s.isBlank());

        System.out.println("Length of String");
        System.out.println("\t" + r.isBlank());





        System.out.println("\n\n\t--- 10. Replace & ReplaceAll ---");
        //10. Replace & ReplaceAll
        s = "INR 200 INR 300 INR 500";

        System.out.println("Replace:");
        System.out.println("\t" + s.replace("INR" , "USD"));
        System.out.println("Replace:");
        System.out.println("\t" + s.replaceAll("[0-9]" , ""));





        System.out.println("\n\n\t--- 11. Format ---");
        //11. Format It
        s = "Welcome %s, Welcome %s";

        System.out.println("Format %s:");
        System.out.println("\t" + String.format(s,"Cookie","Milk"));


        System.out.println("\n\n\t--- 12. SubString ---");
        //12. SubString
        s = "Cookie Love Milk And Goldy is Jealous";

        System.out.println("SubString Extracted");
        System.out.println("\t" + s.substring(15));



        System.out.println("\n\n\t--- 13. Split ---");
        //13. Split
        s = "Milk Love Cookie And Goldy Love Lion";

        System.out.println("\t" + s);


    }


}

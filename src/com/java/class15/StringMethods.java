package com.java.class15;

public class StringMethods {
    public static void main(String[] args) {


    String s1 = "Cookie";
    String s2 = "Milk";
    String s3 = s1 + " & " + s2 + " loved to play outside";



        System.out.println("\t--- 12. SubString ---");
        //12. SubString
        s1 = "Cookie Love Milk And Goldy is Jealous";

        System.out.println("SubString Extracted");
        System.out.println("\t" + s1.substring(7));                 //the whole sentence
        System.out.println("\t" + s1.substring(0,5));               //First word is 0 and , for the number of letter we want to show for the number after , is the letter we want to show like 5 only 5 letters
        System.out.println("\t" + s1.subSequence(3,8));             //For Letter only from 0 to any number you want




        System.out.println("\n\n\t--- 13. Split ---");
        //13. Split
        s1 = "Milk Love Cookie";
        String[] words = s1.split(" ");
        System.out.println("1. Word Length");
        System.out.println("\t" + words.length);

        System.out.println("\n2. First Method");
        System.out.println("\t" + words[2] + words[1] + words[0]);
        System.out.println("\t" + words[0]);
        System.out.println("\t" + words[1]);
        System.out.println("\t" + words[2]);

        System.out.println("\n3. Second Method");
        for (int i = 0; i < words.length; i++){
            System.out.println("\t" + words[i]);
        }




        System.out.println("\n\n\t--- 14. Trim ---");
        s1 = "Milk Love Cookie";

        System.out.println("1. Word Length");
        System.out.println("\t" + words.length);




    }

}

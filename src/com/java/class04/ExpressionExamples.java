package com.java.class04;

public class ExpressionExamples {
    public static void main(String args[]){
        int a = 10, b = 20, c = 30;
        String str1 = "Hello";
        String str2 = "Java";

        System.out.println(a); // 10
        System.out.println(a + b); // 30

        System.out.println("a + b"); // a+b (because it's StringExamples)
        System.out.println("a" + b);  // a20 (a is StringExamples and b is variable of type int)
        System.out.println("a" + b + c);  // a2030 (a is StringExamples and b is variable of type int)

        System.out.println(str1 +  str2); // HelloJava
        System.out.println(str1 + a); // Hello10
        System.out.println(str1 + a + b); // Hello1020 (Left to right)
        System.out.println(a + b + str1); // 30Hello (Left to right)

        System.out.println(str1 + a * b); // Hello200 (As per priority we'll do multiplication first and then addition)

//     System.out.println(str1 + a - b); // Error
        System.out.println(a - b + str1); //

    }
}

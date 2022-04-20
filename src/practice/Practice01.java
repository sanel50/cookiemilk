package practice;

import java.util.Random;

public class Practice01 {
    public static void main(String[] args) {

        int num1 = 10 ;
        int num2 = 20;
        num2 = num1;

        System.out.println("= Output: " + num2);

        num2 += num1;System.out.println("+= Output: " + num2);      //num1 + num1 = 20

        num2 -= num1;System.out.println("-= Output: " + num2);      //num1 - num1 = 10

        num2 *= num1;System.out.println("*= Output: " + num2);      //num1 * num1 = 100

        num2 /= num1;System.out.println("/= Output: " + num2);      //num1 / num1 = 10

        num2 %= num1;System.out.println("%= Output: " + num2);      //num1 % num1 = 0
    }
}

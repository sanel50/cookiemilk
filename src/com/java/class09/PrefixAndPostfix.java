package com.java.class09;

public class PrefixAndPostfix {
    public static void main(String[] args) {

        int i = 4;      //4
        int j = 4;      //4


        int k =  i++ + --j;     //8
        /*

            i = 4 + 1 = 5
            j = 4 - 1 = 3

            k = i++ + --j = 5 + 3 = 8


            k = 8 + 1 = 9
            i = 5 + 1 = 6
            m = k++ - i++ =  9 - 6 = 3




         */
        int m = k++ - i++;      // 0 - 5 = -5

        System.out.println(i);
        System.out.println(j);
        System.out.println(m);
        System.out.println(k);
    }
}
